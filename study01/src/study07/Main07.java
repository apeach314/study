package study07;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		// 1463번 https://www.acmicpc.net/problem/1463
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		int cnt = 0;
		
		if (n==1) {
			System.out.println(cnt);
		} else {
			// 소수는 -1 부터 해야하는 것 같음
			for (int i=2; i<=n; i++) {
				// 소수일때
		        if (n / i != 0) {
		        	n = n-1;
		        	cnt = cnt + 1;	// 연산횟수를 센다
		        	/*if (n%3==0) {
		        		
		        		System.out.println("3으로 나눈 나머지가 0 .. "+cnt);
		        	} else if (n%2==0) {
		        		
		        		System.out.println("2로 나눈 나머지가 0 .. "+cnt);
		        	} else {
		        		System.out.println("n이 2 인가 .. "+cnt);
		        	}*/
		        	break;
		        }
		    }
		}

	}

}
