package sahil;

import java.util.Scanner;

public class zodiac {

	public static void main(String[] args) {
		System.out.println("enter your d.o.b");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		if (month == 1) {
			System.out.println("january it's capricorn");
		} else if (month == 2) {
			System.out.println("feburary it's aquarius");
		} else if (month == 3) {
			System.out.println("march it's pisces");
		} else if (month == 4) {
			System.out.println("april it's aries");
		} else if (month == 5) {
			System.out.println("may it's taurus");
		} else if (month == 6) {
			System.out.println("june it's gemini");
		} else if (month == 7) {
			System.out.println("july it's cancer");
		} else if (month == 8) {
			System.out.println("august it's leo");
		} else if (month == 9) {
			System.out.println("september it's virgo");
		} else if (month == 10) {
			System.out.println("october it's libra");
		} else if (month == 11) {
			System.out.println("november it's scorpio");
		} else if (month == 12) {
			System.out.println("december it's sagitarius");
		} else {
			System.out.println("not birth yet!");
		}

	}

}
