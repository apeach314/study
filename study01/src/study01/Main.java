package study01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        1000, 1001번
        scanner 함수가 기억나지 않았을 때는 웹 화면에서 입력 받은 숫자를 받아와서 계산하는 방법을 생각함.
        더하기 빼기는 쉽지만 어떻게 숫자를 입력 받을 건지?? Scanner 사용은 검색해서 적용함.  
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a+b="+(a+b)+", a-b="+(a-b));
        
        1002번... 터렛?...
         무슨 소리인지 하나도 모르겠다 사진도 뭔지 모르겠고.. 이럴때는 블로그 같은 것을 찾아봐야하나?
        */
        
        // 1003번
        // 0과 1이 각각 몇 번 출력되는지 구하는 프로그램...
        // 리턴 값을 알아서 변수 a,b를 1씩 증가시키면 되는 거 같은데..
        // 근데 리턴값을 어떻게...?
        // fibo() -> 0,1,1,2,3,5,8,13,21....
        
        
        // 단계별로 푸는 문제에서 알고리즘 풀이를 시작함.

        // 2839번
        // 3kg짜리랑 5kg짜리로 배달못하면 -1 출력 하라는 거 아닌가요?
        // 나머지가 3으로 나눴을 때 나누어 떨어지면? 5로 나눈 몫과 나머지를 3으로 나눴을 때 나오는 몫?을 더한다..
        // 나머지가 3으로 나누어 떨어지지 않으면? -1을 출력한다..
        // 결과는 오답인데 문제를 잘 이해를 못 한 것인지... 예시에서 왜 11을 넣었을때 3이 나오는건지 모르겠다.
        int n = scanner.nextInt();
        int a=0,b=0;

        if((n%5)%3==0){        // 5로 나눈 나머지를 3으로 나눠서 나온 나머지의 값이 0이면
            a = n/5;        // 5로 나눈 몫을 a에 저장하고 , 5로 나누어 떨어졌을 때도 걸러지고...
            b = (n%5)/3;    // 5로 나눴을 때 나머지를 3으로 나눈 몫을 b에 저장한다
            System.out.println(a+b);
        }else if(n%3==0){    // 3으로 나누어 떨어지면 3kg짜리 봉지만 가져가면 되니깐...
            System.out.println(n/3);
        }else{
            System.out.println("-1");
        }
        

    }
    
    // 1003문제에 있던 함수...
    public static int fibo(int x) {
        if(x==0) {
            System.out.print("0, ");
            return 0;
        }else if(x==1){
            System.out.print("1, ");
            return 1;
        }else {
            System.out.println("x ::"+x);
            System.out.println("x-1 ="+(x-1)+" // x-2 ="+(x-2));
            return fibo(x-1)+fibo(x-2);
        }
    }

}
