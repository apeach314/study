package study09;

import java.util.Arrays;
import java.util.Scanner;

public class Main09 {
	
	public static void main(String[] args) {
//		Baekjoon8958();
//		Baekjoon2920();
//		Baekjoon11654();
		Baekjoon10809();
    }
		
	public static void Baekjoon8958() {
			
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		String[] cases = new String[n];
		for ( int i=0; i<n; i++ ) {
			cases[i] = scanner.next();
		}
		scanner.close();
		
		for(int i=0; i<n; i++) {
			String str = cases[i];
			int cnt=0;
			int sum=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					cnt++;
					sum = sum + cnt;
				}else {
					cnt=0;
				}
			}
			System.out.println(sum);
		}
	}
	
	
	public static void Baekjoon2920() {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		
		if(str.equals("1 2 3 4 5 6 7 8")) {
			System.out.println("asc");
		}else if(str.equals("8 7 6 5 4 3 2 1")) {
			System.out.println("desc");
		}else {
			System.out.println("mixed");
		}
		
	}
	
	public static void Baekjoon11654() {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		System.out.println((int)str.charAt(0));
		
	}
	
	public static void Baekjoon10809() {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		// �븣�뙆踰� �냼臾몄옄 97~122, 26媛�
		
		int[] result = new int[26];
		Arrays.fill(result, -1);
		
		for(int i=0; i<s.length(); i++) {
			if(result[s.charAt(i)-'a']==-1) {
				result[s.charAt(i)-'a']=i;
			}
		}
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i]+" ");
		}
	}
	
	public static void Baekjoon10809_stream() {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		int[] result = new int[26];
		Arrays.fill(result, -1);
		
		s.chars().forEach(ch -> result[ch-'a'] = s.indexOf(ch));
		Arrays.stream(result).forEach(val -> System.out.print(val + " "));
	}
	
}
