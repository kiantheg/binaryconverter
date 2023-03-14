import java.util.*;

public class binary {
	private String input;
	private String conversion;
	
	public binary (String input, String conversion) {
		this.input=input;
		this.conversion=conversion;
	}
	
	public String toBinary (String dec) {
		String binary="";
		long decimal = Long.valueOf(dec);
		while (decimal>0) {
			binary=decimal%2+binary;
			decimal=decimal/2;
		}
		return binary;
	}
	
	public long toDecimal (String binary) {
		long decimal=0;
		int counter=0;
		while (binary!="") {
			int digit=Integer.valueOf(binary.substring(binary.length()-1));
			long power=(long) Math.pow(2, counter);
			decimal+=(power*digit);
			counter++;
			binary=binary.substring(0,binary.length()-1);
		}
		return decimal;
	}
	
	public static void main (String [] args) {
		Scanner scanny = new Scanner (System.in);
		System.out.println("Do you want to convert to binary or decimal? (b for binary and d for decimal)");
		String conversion = scanny.nextLine();
		System.out.println("What number would you like to convert?");
		String input = scanny.next();
		binary bin = new binary (input, conversion);
		if (conversion.equals("b")) {
			System.out.println(bin.toBinary(input));
		}
		else if (conversion.equals("d")) {
			System.out.println(bin.toDecimal(input));
		}
	}
}
