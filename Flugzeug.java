package Flugbuchung;

public class Flugzeug {

	private static int sitzplatz = 0;

	private String name;

	
	public Flugzeug(String name) {
		super();
		this.name = name;
		
	}
	
	public void ticketKaufen() {
		System.out.println();
	}

	public static int getSitzplatz() {
		return sitzplatz;
	}

	public String getName() {
		return name;
	}

}
