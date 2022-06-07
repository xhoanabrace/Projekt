package Flugbuchung;

import java.util.Scanner;

public class Flugbuchung {
	static Scanner scanner = new Scanner(System.in);
	static Destinationen[] destinationen = new Destinationen[10];

	public static void main(String[] args) {

		destinationen[0] = new Destinationen("Stuttgart", "Rom", 15.06, 18.06);
		destinationen[1] = new Destinationen("Rom", "Stuttgart", 20.06, 23.06);
		destinationen[2] = new Destinationen("Hamburg", "Paris", 16.06, 19.06);
		destinationen[3] = new Destinationen("Paris", "Hamburg", 21.06, 24.06);
		destinationen[4] = new Destinationen("Berlin", "Zürich", 17.06, 20.06);
		destinationen[5] = new Destinationen("Zürich", "Berlin", 22.06, 25.06);
		destinationen[6] = new Destinationen("Frankfurt", "New York", 18.06, 21.06);
		destinationen[7] = new Destinationen("New York", "Frankfurt", 23.06, 26.06);
		destinationen[8] = new Destinationen("München", "Tirana", 19.06, 22.06);
		destinationen[9] = new Destinationen("Tirana", "München", 24.06, 27.06);

		System.out.println("Willkommen ins xxxx Reisebüro!" + "\n" + "Hier können Sie ihre Ticket kaufen!");
		flugbuchen();

	}

	static void flugbuchen() {

		System.out.println("Wählen sie ihr Abflughafen ");
		String abflug = scanner.nextLine();
		System.out.println("Wählen sie ihr Ankunftflughafen");
		String ankunft = scanner.nextLine();

		for (Destinationen element : destinationen) {
			if (abflug.equalsIgnoreCase(element.getAbflug()) && ankunft.equalsIgnoreCase(element.getAnkunft())) {
				System.out.println("Ne kemi keto opsione");
				System.out.println(element.toString());
				System.out.println("________________________________");
				kalender();

			} else if (abflug.equalsIgnoreCase(element.getAbflug())
					&& !ankunft.equalsIgnoreCase(element.getAnkunft())) {
				System.out.println("nga " + abflug + " Kemi vetem kto opsione");
				System.out.println(element.toString());

			} else if (!abflug.equalsIgnoreCase(element.getAbflug())
					&& ankunft.equalsIgnoreCase(element.getAnkunft())) {
				System.out.println("per ne " + ankunft + " Kemi vetem kte opsion");
				System.out.println(element.toString());

//			 }else if (!abflug.equalsIgnoreCase(element.getAbflug()) && !ankunft.equalsIgnoreCase(element.getAbflug())) {
//				 System.out.println("nuk kemi fluturim per ju");
//				 break;
//			 }
			}
		}
	}

	static void ticketkaufen() {
		System.out.println("Möchten Sie das Ticket kaufen JA oder NEIN");
		String antwort2 = scanner.nextLine();
		if (antwort2.equalsIgnoreCase("ja")) {
			System.out.println("WEiter....");
		} else {
			System.out.println("Danke für ihre Zeit");
		}
	}
	
	public static void kalender() {
		String monat = "JUNI";
		int anfang = 1;
		int tagNr = 31;

		String kopfzeile = "  Mo  Di  Mi  Do  Fr  Sa  So  ";

		System.out.println(monat);
		System.out.println(kopfzeile);

		int tag = 1;

		for (int i = 1; i <= tagNr; i++) {
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
