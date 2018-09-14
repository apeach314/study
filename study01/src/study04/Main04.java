package study04;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main04 {
	//https://www.acmicpc.net/problem/10871
	public static void Baekjoon10871() {
		Scanner scanner = new Scanner(System.in);
        
        String nx = scanner.nextLine();
        String str = scanner.nextLine();
        scanner.close();
        
        String[] strNX = nx.split(" ");
        int[] arrayNX = Arrays.stream(strNX).mapToInt(Integer::parseInt).toArray();
        String[] strA = str.split(" ");
        int[] arrayA = Arrays.stream(strA).mapToInt(Integer::parseInt).filter(n -> n < arrayNX[1]).toArray();
        
        for (int i : arrayA) {
        	System.out.print(i+" ");
		}
//        for(int i=0; i<arrayNX[0]; i++ ){
//            if(arrayA[i]<arrayNX[1]){
//                 System.out.print(arrayA[i]+" ");
//            }
//        }
	}
	
	public static void Baekjoon1546() {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String str = scanner.nextLine();
        scanner.close();
        
        double sum = 0;
        String[] strA = str.split(" ");
//        int[] arrayA = Arrays.stream(strA).sorted().mapToInt(Integer::parseInt).toArray();
        double[] arrayA = Arrays.stream(strA).mapToDouble(Double::parseDouble).sorted().toArray();
        
        int m = (int)arrayA[n-1];
        
        for(int i=0; i<n; i++){
       	 sum = sum+arrayA[i]/m*100;
        }
        System.out.println("평균 = "+sum/n);
	}
	
	public static void Baekjoon4344() {
		Scanner scanner = new Scanner(System.in);
	   	 int c = Integer.parseInt(scanner.nextLine());
	   	 String str ;
	   	 String[] strA;
	   	 // 저장을 위해서는 jagged array가 필요
	   	 double[][] scoreA = new double[c][];
	   	 OptionalDouble[] avg = new OptionalDouble[c];
	   	 long lessThanAverageCount[] = new long[c];
	   	 
	   	 for(int i=0; i<c; i++) {
	   		 str = scanner.nextLine();
	   		 strA = str.split(" ");
	   		scoreA[i] = Arrays.stream(strA).mapToDouble(Double::parseDouble).toArray();
	   		int length = scoreA[i].length;
	   		
	   		 avg[i] = Arrays.stream(strA, 1, length).mapToDouble(Double::parseDouble).average();
	   		//System.out.println(avg[i]);
	   		
	   		OptionalDouble average = avg[i];
	   		lessThanAverageCount[i] = Arrays.stream(strA, 1, length).mapToInt(Integer::parseInt).filter(num -> num > average.getAsDouble()).count();
	   		//System.out.println(lessThanAverageCount[i]);
	   		
	   		//System.out.format("%.3f%n", lessThanAverageCount[i] / (double)(length - 1) * 100);
	   	 }
	   	 
	   	 for (int i=0; i<c; i++) {
	   		 int length = scoreA[i].length;
	   		 // length - 1 인 이유: index 0 은 성적이 아니고 성적의 갯수를 입력하는 칸, 그러므로 length -1이 필요
	   		 System.out.format("%.3f%n", lessThanAverageCount[i] / (double)(length - 1) * 100);
	   	 }
	   	 
	   	 /*
	   	  * scoreA = Arrays.stream(strA).mapToDouble(Double::parseDouble).toArray();
	   		 n = scoreA[0]; avg=0; sum=0; x=0;
	   		 
	   		 for(int j=1;j<scoreA.length; j++){
	   			 sum = sum+scoreA[j];
	   		 }
	   		 avg = sum/n;
	   		 
	   		 for(int j=1;j<scoreA.length; j++){
	   			 if(avg<scoreA[j]){
	   				 x++;
	   			 }
	   		 }
	   		 System.out.format("%.3f%n",x/n*100);
	   	  */
	   	 
	   	 scanner.close();
	}
	
     public static void main(String[] args) {
    	 //Baekjoon10871();
    	 //Baekjoon1546();
    	 Baekjoon4344();
     }
}