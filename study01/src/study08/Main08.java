package study08;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		int result = a * b * c;
		int[] array = new int[10];
		// 999 * 999 * 999 = 997002999
		
		String str = String.valueOf(result);
		
		for(int i=0; i<str.length(); i++){
			array[str.charAt(i)-'0']++;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println((int)'h');
	}

}
