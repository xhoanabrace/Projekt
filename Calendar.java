package Flugbuchung;
//import java.util.Scanner;

public class Calendar {

//	public static void main(String[] args) {
//
//		// Scanner scanner = new Scanner(System.in);
//	}
	public void kalender() {
		String monat = "JUNI";
		int anfang = 1;
		int tagNr = 31;

		String kopfzeile = "  Mo  Di  Mi  Do  Fr  Sa  So  ";

		System.out.println(monat);
		System.out.println(kopfzeile);

		int tag = 1;

		for (int i = 1; i <= anfang + tagNr - 1; i++) {
			if (i % 7 == 1) {
				System.out.println();
			}
			if (i < anfang) {
				System.out.print("   ");
			} else {
				if (tag / 10 == 0) {
					System.out.print("   " + tag);
				} else {
					System.out.print("  " + tag);
				}

				tag++;
			}
		}
		
	}
}
