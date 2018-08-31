package study03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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
             
             int[] numsA = Arrays.stream(strA).sorted().mapToInt(Integer::parseInt).toArray();
             int[] numsB = Arrays.stream(strB).mapToInt(Integer::parseInt).toArray();
//             Arrays.sort(numsB, Collections.reverseOrder());
             
             List<int[]> list = Arrays.asList(numsB);
             Collections.reverse(list); // arr 배열은 그대로이며, list는 arr배열의 내림차순으로 저장된다고 하는데 안됨...ㅠㅠ
             System.out.println(list.get(0)[0]);
             System.out.println(list.get(0)[1]);
             System.out.println(list.get(0)[2]);
             
//             Arrays.sort(numsA);
             /*for (int number : numsA) {
               System.out.println("Number = " + number);
             }*/
             
             for(int i=0;i<n;i++){
                    s = s+numsA[i]*list.get(0)[i];
             }System.out.println(s);
             
             
             
       }
}