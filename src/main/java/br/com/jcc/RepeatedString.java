package br.com.jcc;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long aCount = repeatedString(s, n);
		System.out.println(aCount);
		sc.close();
	}
	
	public static long repeatedString(String s, long n) {
		long q = 0, partialStrLen = 0;		
		q = n / s.length();
		partialStrLen = n % s.length();
		
		return q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
    }

	public static long getLetterCount(String s, long length) {
		long count = 0;
		for (int i = 0; i < length; i++) {
			if(s.charAt(i) == 'a'){
				count++;
			}
		}
		return count;
	}

}
