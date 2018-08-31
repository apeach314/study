package study03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main03 {
	public static int find(int[] a, int target)
	{
		for (int i = 0; i < a.length; i++)
			if (a[i] == target)
				return i;

		return -1;
	}
	
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
             
             // numsB���� .sorted(Collections.reverseOrder()) �� �� ������ index�� �����´�.
             // numsB
             // 2 7 8 3 1

             // numsIndexB
             // 2 1 3 0 4
             // numsB�� index 2�� ���� 8�̰� numsB �������� ���� �� ���� �տ� ���� ����, �׷��� �ι�° ��ġ (numbIndexB indexOf 0)
             // numsB�� index 1�� ���� 7�̰� numsB �������� ���� �� �ι� ° ���� ����, �׷��� �ι�° ��ġ (numbIndexB indexOf 1)
             
             int[] numsIndexB = Arrays.stream(numsB)
            		 .boxed()
            		 .sorted(Collections.reverseOrder())
            		 .mapToInt(i -> Main03.find(numsB, i))
            		 .toArray();
             
             for (int num : numsIndexB) {
            	 System.out.println(num);
             }
             
              // ���� �Ǹ�
             for(int i=0;i<n;i++) {
               s = s+numsA[i]*numsB[numsIndexB[i]];
             }
             System.out.println(s);
            	 
             //             Arrays.sort(numsB, Collections.reverseOrder());
             
//             List<int[]> list = Arrays.asList(numsB);
//             Collections.reverse(list); // arr �迭�� �״���̸�, list�� arr�迭�� ������������ ����ȴٰ� �ϴµ� �ȵ�...�Ф�
//             System.out.println(list.get(0)[0]);
//             System.out.println(list.get(0)[1]);
//             System.out.println(list.get(0)[2]);
             
//             Arrays.sort(numsA);
             /*for (int number : numsA) {
               System.out.println("Number = " + number);
             }*/
             
//             for(int i=0;i<n;i++){
//                    s = s+numsA[i]*list.get(0)[i];
//             }System.out.println(s);
             
             
             
       }
}