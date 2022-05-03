package biDirectionalCodeConverter;

public class Main {
	public static void main(String args[]) {

		for (int i = 0; i < 16; i++) {
			int binary = DecimalToBinary.toBinary(i);
			int grey = BinaryToGrey.toGrey(i);

			System.out.print("The binary code of the decimal number " + i + " is ");
			System.out.println(String.format("%04d", binary).substring(0));
			System.out.print("The grey code of the decimal number " + i + " is ");
			System.out.println(String.format("%04d", grey).substring(0));
		}
	}
}
