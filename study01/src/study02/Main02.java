package study02;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		// 11720¹ø
		Scanner scanner = new Scanner(System.in);
		
		int n,a,sum=0;
		n = Integer.parseInt(scanner.nextLine());
		String str = scanner.nextLine();
		scanner.close();
		
		for(int i=0;i<n;i++) {
			char cha = str.charAt(i);
			a = Integer.valueOf(String.valueOf(cha));
			sum=sum+a;
		}System.out.println(sum);
		
		/*int n = scanner.nextInt();
        double m = scanner.nextDouble();
        scanner.close();
        
		double c;
        int d=0,sum=0;
        for(int i=n-1;i>=0;i--){
        	c = Math.pow(10, i);
        	d = (int)(m/c);	
        	m = (int)(m-(d*c));	
        	sum=sum+d;
        }System.out.println(sum);*/
		
		
		// 1002¹ø ÅÍ·¿
		System.out.println("2^3 = "+Math.pow(2, 3));
		System.out.println("4ÀÇ Á¦°ö±Ù = "+Math.sqrt(4));
	}

}
