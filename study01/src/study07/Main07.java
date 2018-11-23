package study07;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		// 1463번 https://www.acmicpc.net/problem/1463
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int cnt = 0;
		
//		if (n==1) {
//			System.out.println(cnt);
//		} else {
			for (int i=2; i<=n; i++) {
    			
    			if (n%3==0) {
	        		n = n/3;
	        		cnt = cnt + 1;
	        	} else if (n%2==0) {
	        		n = n/2;
	        		cnt = cnt + 1;
	        		System.out.println("2로 나누는 조건문 "+n);
	        	} else {
	        		n = n-1;
	        		cnt = cnt + 1;
	        	}
    			
		    }
			System.out.println(cnt);
//		}

		
		
	}

}
