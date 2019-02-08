package ketvirta.savaite.antra.paskaita;

public class PerimetroSkaiciavimas {
	
	public PerimetroSkaiciavimas(int spindulys) {
		
		float perimetras = 2 * UzduotisFinalMain.PI * (spindulys *spindulys);
		
		System.out.println("apskritimo D" + spindulys+ " perimetras "+ perimetras);
		
	}
	

}
