package uzduotis3;

public class Prisiminimas {

	private String informacija;
	
	
	public void issaugok(String manoUzrasai) {
		
		if (manoUzrasai.indexOf("bananas") == -1 ) {
		
		informacija = manoUzrasai;
	}
	
	}
	public void sprausdink() {
		
		System.out.println("saugoma infio " +informacija);
	}
	
}
