package biDirectionalCodeConverter;

import java.util.ArrayList;

public class DecimalToBinary {

	public static int toBinary(int decimal) {

		int i = 0;
		int binaryInteger = 0;
		ArrayList<Integer> binary = new ArrayList<>();
		while (decimal > 0) {
			binary.add(i++, decimal % 2);
			decimal /= 2;
		}

		for (int j = binary.size() - 1; j >= 0; j--) {
			binaryInteger = binary.get(j) + binaryInteger * 10;
		}
		return binaryInteger;
	}
}
