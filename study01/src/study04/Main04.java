package study04;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
     public static void main(String[] args) {
          // 백준 10871번
          /*
          Scanner scanner = new Scanner(System.in);
          
          String nx = scanner.nextLine();
          String str = scanner.nextLine();
          scanner.close();
          
          String[] strNX = nx.split(" ");
          int[] arrayNX = Arrays.stream(strNX).mapToInt(Integer::parseInt).toArray();
          String[] strA = str.split(" ");
          int[] arrayA = Arrays.stream(strA).mapToInt(Integer::parseInt).toArray();
          
          for(int i=0; i<arrayNX[0]; i++ ){
              if(arrayA[i]<arrayNX[1]){
                   System.out.print(arrayA[i]+" ");
              }
          }
          */
    	 
    	 
    	 // 백준 1546번
    	 /*
    	 Scanner scanner = new Scanner(System.in);
    	 int n = Integer.parseInt(scanner.nextLine());
    	 String str = scanner.nextLine();
         scanner.close();
         
         double sum = 0;
         String[] strA = str.split(" ");
//         int[] arrayA = Arrays.stream(strA).sorted().mapToInt(Integer::parseInt).toArray();
         double[] arrayA = Arrays.stream(strA).mapToDouble(Double::parseDouble).sorted().toArray();
         
         int m = (int)arrayA[n-1];
         
         for(int i=0; i<n; i++){
        	 sum = sum+arrayA[i]/m*100;
         }
         System.out.println("평균 = "+sum/n);
         */
    	 
    	 
    	 // 백준 4344번
    	 /*
    	 Scanner scanner = new Scanner(System.in);
    	 int c = Integer.parseInt(scanner.nextLine());
    	 String str ;
    	 String[] strA;
    	 double[] scoreA;
    	 double sum, avg,n, x;
    	 
    	 for(int i=0; i<c; i++){
    		 str = scanner.nextLine();
    		 strA = str.split(" ");
    		 scoreA = Arrays.stream(strA).mapToDouble(Double::parseDouble).toArray();
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
    	 }
    	 
    	 scanner.close();
    	 */
    	 
          
     }
}