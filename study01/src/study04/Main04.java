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
//        	 System.out.println(arrayA[i]/m*100);
        	 sum = sum+arrayA[i]/m*100;
         }
         System.out.println("평균 = "+sum/n);
         */

         
          
          
          
     }
}