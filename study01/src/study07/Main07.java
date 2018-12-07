package study07;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        int[] min = new int[1000001]; // 10�� 6���� �ִ밪�̱� ������
        
        min[1] = 0; // ����ϱ� ������� �迭�� 0������ ���������� ���������� 1���� �����ϴ� ��ó�� ����.
        
        for(int i=2; i<X+1; i++){
            min[i] = min[i-1] +1; // 3�̳� 2�� ���������� ������ �־��� ������ 1 ���� ���� ���� �ּ� ����Ƚ�� + (-1) ������ �� Ƚ��
            
            if(i%2 == 0 && min[i/2] + 1 < min[i]){
                min[i] = min[i/2] + 1; // 2�� �ٷ� ������ ���� ��� �ּڰ� ���ؼ� ���� ���� Ƚ���� ����.
            }
            if(i%3 == 0 && min[i/3] + 1 < min[i]){
                min[i] = min[i/3] + 1; // 3���� �ٷ� �������� ��, ���Ե� ���� ���� �񱳰� �̷����Ƿ� ��� ��쿡 ���� �񱳰� ����.
                                        // (-1) ������ �̷��� Ƚ���� 2�� �ٷ� �������� ���� ���� ���� ���� ������ min[i]�� ������ �����̴�.
            }
            
        }
        System.out.println(min[X]);
		
		
		
		
		// 1463�� https://www.acmicpc.net/problem/1463
		/*Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int cnt = 0;
		
//		if (n==1) {
//			System.out.println(cnt);
//		} else {
			do {
				if (n == 1) {
					break;
				}
				else if ((n-1)%3==0) {
					n--;
					System.out.println("1�� ���� ���ǹ� " + n);
					cnt += 1;
					
					n = n/3;
	        		System.out.println("3���� ������ ���ǹ� "+n);
	        		cnt += 1;
	        	}
				else if (n%3==0) {
	        		n = n/3;
	        		cnt = cnt + 1;
	        		System.out.println("3���� ������ ���ǹ� "+n);
	        	} else if (n%2==0) {
	        		n = n/2;
	        		cnt = cnt + 1;
	        		System.out.println("2�� ������ ���ǹ� "+n);
	        	} else {
	        		n = n-1;
	        		cnt = cnt + 1;
	        		System.out.println("1�� ���� ���ǹ� "+n);
	        	}
		    } while (n != 1);
			System.out.println(cnt);
//		}

		*/
		
	}

}
