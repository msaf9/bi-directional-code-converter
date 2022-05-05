package biDirectionalCodeConverter;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryToGray {

	public static int toGray(int decimal) {

		int i = 0;
		int grayInteger = 0;
		int binary = DecimalToBinary.toBinary(decimal);

		ArrayList<Integer> binaryArrayList = new ArrayList<>();
		ArrayList<Integer> grayArrayList = new ArrayList<>();

		while (binary > 0) {
			binaryArrayList.add(i++, binary % 10);
			binary /= 10;
		}

		Collections.reverse(binaryArrayList);

		for (int j = 0; j < binaryArrayList.size(); j++) {
			if (j == 0) {
				grayArrayList.add(j, binaryArrayList.get(j));
			} else {
				grayArrayList.add(j, (binaryArrayList.get(j - 1) ^ binaryArrayList.get(j)));
			}
		}

		for (int j = 0; j < grayArrayList.size(); j++) {
			grayInteger = grayArrayList.get(j) + grayInteger * 10;
		}
		return grayInteger;
	}
}
