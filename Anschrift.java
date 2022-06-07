package Flugbuchung;


public class Destinationen {
	
	 
	
	private String abflug;
	private String ankunft;
	private double abflugdatum1;
	private double abflugdatum2;



	
	public Destinationen(String abflug, String ankunft, double abflugdatum1 ,double abflugdatum2) {
		super();
		this.abflug = abflug;
		this.ankunft = ankunft;
		this.abflugdatum1 = abflugdatum1;
		
		this.abflugdatum2 = abflugdatum2;
	

	}

	public double getAbflugdatum1() {
		return abflugdatum1;
	}



	public double getAbflugdatum2() {
		return abflugdatum2;
	}

	

	public String getAbflug() {
		return abflug;
	}

	public String getAnkunft() {
		return ankunft;
	}

	
	@Override
	public String toString() {
		return abflug + " - " + ankunft + " "+ abflugdatum1+" "+abflugdatum2;
	}

	public String info() {
		return abflug;
	}
	
			
	
		
		
	}

