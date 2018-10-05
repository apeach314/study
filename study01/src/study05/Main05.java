package study05;

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {
    
    public static void Baekjoon1085() {
        // 1085번  https://www.acmicpc.net/problem/1085
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] strA = str1.split(" ");
        int[] numsA = Arrays.stream(strA).mapToInt(Integer::parseInt).toArray();
        // ex) numsA : 6,2,10,3
        scanner.close();
        
        int x = numsA[0];
        int y = numsA[1];
        int h = numsA[2];
        int w = numsA[3];
        // x, y, h-y, w-x 중에 최소값 찾기
        int[] numsB = new int[]{x,y,h-x,w-y};
        numsB = Arrays.stream(numsB).sorted().toArray();
        System.out.println(numsB[0]);
    }
    
    
    public static void Baekjoon1010() {
        // 1010번   https://www.acmicpc.net/problem/1010
        // 다이나믹 프로그래밍?? 조합...?
        /*    
            입력                    
            3                    출력
            2 2                    1
            1 5                    5
            13 29                67863915
        */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int m,n ;
        
        for (int i = 0; i < num; i++) {
             m = scanner.nextInt();
             n = scanner.nextInt();
            facto(m,n);
        }
        scanner.close();
        
        // nCm
        //    n!
        //  ㅡㅡㅡㅡ
        // (n-m)!*m!
        
    }
    
    public static void facto(int m,int n) {
    	int nfac=1, mfac=1, xfac=1;
    	int x = n-m;
    	
        for(int i=n;i>=1;i--) {
        	nfac=nfac*i;
        }
        for(int i=m;i>=1;i--) {
        	mfac=mfac*i;
        }
        for(int i=x;i>=1;i--) {
        	xfac=xfac*i;
        }
        
        System.out.println(" fac :: "+ nfac/(mfac*xfac));
    }
    

    public static void main(String[] args) {
//        Baekjoon1085();
        Baekjoon1010();
        
    }

}
