package study07;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		// 1463�� https://www.acmicpc.net/problem/1463
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int cnt = 0;
		
		if (n==1) {
			System.out.println(cnt);
		} else {
			// �Ҽ��� -1 ���� �ؾ��ϴ� �� ����
			for (int i=2; i<=n; i++) {
				// �Ҽ��϶�
		        if (n / i != 0) {
		        	n = n-1;
		        	cnt = cnt + 1;	// ����Ƚ���� ����
		        	/*if (n%3==0) {
		        		
		        		System.out.println("3���� ���� �������� 0 .. "+cnt);
		        	} else if (n%2==0) {
		        		
		        		System.out.println("2�� ���� �������� 0 .. "+cnt);
		        	} else {
		        		System.out.println("n�� 2 �ΰ� .. "+cnt);
		        	}*/
		        	break;
		        }
		    }
		}

	}

}
