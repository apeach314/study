package study11;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int apt[][] = new int[15][15];
        for(int i=0; i<15; i++) {
               apt[i][0] = 1;
               apt[0][i] = i+1;	// i는 0부터인데 방은 1번째 방부터 시작이니까
        }
        
        for(int i = 1 ; i < 15 ; i++) {
            for(int j = 1 ; j < 15 ; j++) {
            	apt[i][j] = apt[i][j-1] + apt[i-1][j];
            	// k층 n호에 사는 사람들 수 = k층 n-1호에 하는 사람들 + k-1층 n호에 사는 사람들
            	System.out.print(apt[i][j] + " ");
            }
            System.out.println();
        }
		
        int caseT = scanner.nextInt();          // Test case
        int results[] = new int[caseT];
        for(int i=0; i<caseT; i++){
           int k = scanner.nextInt(); // k층
           int n = scanner.nextInt(); // n호
           results[i] = apt[k][n-1];
        }
        
        for(int result: results) {
            System.out.println(result);
        }

	}

}
