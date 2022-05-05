package biDirectionalCodeConverter;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int decimal, binary, gray;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your decimal number: ");
		decimal = sc.nextInt();
		sc.close();

		binary = DecimalToBinary.toBinary(decimal);
		gray = BinaryToGray.toGray(decimal);

		System.out.print("The binary code of the decimal number " + decimal + " is ");
		System.out.println(String.format("%04d", binary).substring(0));
		System.out.print("The gray code of the decimal number " + decimal + " is ");
		System.out.println(String.format("%04d", gray).substring(0));

	}
}
