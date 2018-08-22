package study02;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		// 11720¹ø
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
        double m = scanner.nextDouble();
        scanner.close();
        
		double c;
        int d=0,sum=0;
        for(int i=n-1;i>=0;i--){
        	c = Math.pow(10, i);
        	d = (int)(m/c);	
        	m = (int)(m-(d*c));	
        	sum=sum+d;
        }System.out.println(sum);
        
	}

}
