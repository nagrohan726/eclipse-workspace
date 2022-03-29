package Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {

		Long l = 123345365758l;

		NumberFormat nf1 = NumberFormat.getInstance(Locale.UK);
		NumberFormat nf2 = NumberFormat.getInstance(Locale.US);

		System.out.println(nf1.format(l));
		System.out.println(nf2.format(l));

	}

}
