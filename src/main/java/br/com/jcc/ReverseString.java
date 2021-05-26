package br.com.jcc;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello World!";
		System.out.println(reverseString(str));

	}

	private static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i--){
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
