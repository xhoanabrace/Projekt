package Passagier;

public class Passagier {

	private String vorname;
	private String nachname;
	private int geburtsdatum;
	private Anschrift anschrift;

	public Passagier(String vorname, String nachname, int geburtsdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getGeburtsdatum() {
		return geburtsdatum;
	}

}
