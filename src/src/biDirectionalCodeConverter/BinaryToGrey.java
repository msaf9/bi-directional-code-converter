package biDirectionalCodeConverter;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryToGrey {

	public static int toGrey(int decimal) {

		int i = 0;
		int greyInteger = 0;
		int binary = DecimalToBinary.toBinary(decimal);

		ArrayList<Integer> binaryArrayList = new ArrayList<>();
		ArrayList<Integer> greyArrayList = new ArrayList<>();

		while (binary > 0) {
			binaryArrayList.add(i++, binary % 10);
			binary /= 10;
		}

		Collections.reverse(binaryArrayList);

		for (int j = 0; j < binaryArrayList.size(); j++) {
			if (j == 0) {
				greyArrayList.add(j, binaryArrayList.get(j));
			} else {
				greyArrayList.add(j, (binaryArrayList.get(j - 1) ^ binaryArrayList.get(j)));
			}
		}

		for (int j = 0; j < greyArrayList.size(); j++) {
			greyInteger = greyArrayList.get(j) + greyInteger * 10;
		}
		return greyInteger;
	}
}
