package br.com.jcc;

public class ReverseInteger {

	public static void main(String[] args) {
		int input = 54321;
		System.out.println(reverseInt(input));
	}

	private static int reverseInt(int input) {
		long reversed = 0;
		
		while (input != 0) {
			reversed = reversed * 10 + input % 10;
			input = input / 10;
			if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
				return 0;
			}
		}
		
		String reversedString = Long.toString(reversed);
		
		return Integer.parseInt(reversedString);
	}

}
