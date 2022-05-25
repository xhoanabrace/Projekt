package Passagier;

public class Anschrift {

	private String strasse;
	private int hausnummer;
	private int plz;
	private String ort;

	public Anschrift(String strasse, int hausnummer, int plz, String ort) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public int getHausnummer() {
		return hausnummer;
	}

	public int getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}

}

