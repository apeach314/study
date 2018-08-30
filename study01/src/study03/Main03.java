package study03;

import java.util.Arrays;
import java.util.Scanner;
public class Main03 {
       public static void main(String[] args){
             
             Scanner sc = new Scanner(System.in);
             int n = Integer.parseInt(sc.nextLine());
             String str1 = sc.nextLine();
             String str2 = sc.nextLine();
             sc.close();
             
             int s=0;
             String[] strA = str1.split(" ");
             String[] strB = str2.split(" ");
             
             int[] numsA = Arrays.stream(strA).mapToInt(Integer::parseInt).toArray();
             int[] numsB = Arrays.stream(strB).mapToInt(Integer::parseInt).toArray();
             Arrays.sort(numsA);
             /*for (int number : numsA) {
               System.out.println("Number = " + number);
           }*/
             
             for(int i=0;i<n;i++){
                    s = s+numsA[i]*numsB[i];
             }System.out.println(s);
             
             
             
       }
}