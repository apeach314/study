package study07;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        
        int[] min = new int[1000001]; // 10의 6승이 최대값이기 때문에
        
        min[1] = 0; // 계산하기 쉬우려고 배열은 0번부터 시작하지만 인위적으로 1부터 시작하는 것처럼 만듦.
        
        for(int i=2; i<X+1; i++){
            min[i] = min[i-1] +1; // 3이나 2로 나누어지지 않으면 주어진 숫자의 1 작은 수에 대한 최소 연산횟수 + (-1) 연산을 한 횟수
            
            if(i%2 == 0 && min[i/2] + 1 < min[i]){
                min[i] = min[i/2] + 1; // 2로 바로 나누어 지는 경우 최솟값 비교해서 작은 연산 횟수로 대입.
            }
            if(i%3 == 0 && min[i/3] + 1 < min[i]){
                min[i] = min[i/3] + 1; // 3으로 바로 나누어질 때, 대입된 값에 대한 비교가 이뤄지므로 모든 경우에 대한 비교가 성립.
                                        // (-1) 연산이 이뤄진 횟수와 2로 바로 나누었을 때에 대한 최종 값이 마지막 min[i]에 들어오기 때문이다.
            }
            
        }
        System.out.println(min[X]);
		
		
		
		
		// 1463번 https://www.acmicpc.net/problem/1463
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
					System.out.println("1을 빼는 조건문 " + n);
					cnt += 1;
					
					n = n/3;
	        		System.out.println("3으로 나누는 조건문 "+n);
	        		cnt += 1;
	        	}
				else if (n%3==0) {
	        		n = n/3;
	        		cnt = cnt + 1;
	        		System.out.println("3으로 나누는 조건문 "+n);
	        	} else if (n%2==0) {
	        		n = n/2;
	        		cnt = cnt + 1;
	        		System.out.println("2로 나누는 조건문 "+n);
	        	} else {
	        		n = n-1;
	        		cnt = cnt + 1;
	        		System.out.println("1을 빼는 조건문 "+n);
	        	}
		    } while (n != 1);
			System.out.println(cnt);
//		}

		*/
		
	}

}
