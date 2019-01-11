package study10;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
	
	public static void main(String[] args) {
		Baekjoon1316();
    }
		
	public static void Baekjoon1316() {
			
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] cases = new String[n];
		for ( int i=0; i<n; i++ ) {
			cases[i] = scanner.next();
		}
		scanner.close();
		
		int cnt = n;	// 그룹단어 count
		
		for(int i=0; i<n; i++) {
			String str = cases[i];		// 입력받은 단어 
			int[] array = new int[26];
			Arrays.fill(array, -1);		// 전부 -1로 세팅.
			
			if (str.length() == 1) {
				continue;
			}
			
			array[str.charAt(0)-'a'] = 0;
			for(int j=1; j<str.length(); j++) {
				// 한번 나왔던 알파벳인 경우 단어의 앞,뒤 알파벳을 비교해서 다르면 그룹단어 카운트 안함.
				if(array[str.charAt(j)-'a']==0 && str.charAt(j)!=str.charAt(j-1) ) {
					array[str.charAt(j)-'a']=-1;		// 알파벳 체크
					cnt--;
					break;
				}else{
					array[str.charAt(j)-'a']=0;
				}
			}
		}
		System.out.println(cnt);
		
	}
	
}
