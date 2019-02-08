package ketvirta.savaite.antra.paskaita;

public class Uzduotis4Main {

	public static void main(String[] args) {
		StudentData stdt = new StudentData(554541, "Tomas", 25);
		
		stdt.spausdink();
		
		
		System.out.println("gimimo metai " +stdt.duokGimimoMets());
		System.out.println("vardas " +stdt.getterVardas());
		System.out.println("studento ID " +stdt.gettterId());
		
		

	}

}
