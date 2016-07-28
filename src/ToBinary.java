import java.util.Scanner;

public class ToBinary {

	Scanner myScanner = new Scanner(System.in); // create a Scanner object
	String input = "";

	public int getInput() { // get number from user via command prompt
		System.out.println("Input number to convert : ");
		input = myScanner.nextLine();
		int num = Integer.parseInt(input);
		return num; // return entered number
	}

	public void convertToBinary(int input) {
		int modResult = 0, num = input; 
		StringBuffer remainder = new StringBuffer();

		if (input > 1) { // number entered is greater than 1
			while (num > 0) { // while the number entered is greater than zero
				modResult = num % 2; // save result of modulus calculation to the modResult variable
				num = num / 2; // divide the number by 2 and save the result to the num variable
				remainder.append(modResult); // append the modResult variable to a Stringbuffer to hold the result of the modulus calculation for each iteration
			}
		} else { // the number entered is 1
			remainder.append(1); // append 1 to result
		}
		System.out.println(remainder.reverse()); // reverse the order of the modulus calculations

	}

	public static void main(String[] args) {
		ToBinary toBinary = new ToBinary();
		toBinary.convertToBinary(toBinary.getInput());
	}
}
