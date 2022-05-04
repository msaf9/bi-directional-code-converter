package biDirectionalCodeConverter;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int decimal, binary, grey;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your decimal number: ");
		decimal = sc.nextInt();
		sc.close();

		binary = DecimalToBinary.toBinary(decimal);
		grey = BinaryToGrey.toGrey(decimal);

		System.out.print("The binary code of the decimal number " + decimal + " is ");
		System.out.println(String.format("%04d", binary).substring(0));
		System.out.print("The grey code of the decimal number " + decimal + " is ");
		System.out.println(String.format("%04d", grey).substring(0));

	}
}
