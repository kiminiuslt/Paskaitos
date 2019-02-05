package ketvirta.savaite.pirma.paskaita;

public class Tipai5Main {

	public static void main(String[] args) {

		Tipai5 a = new Tipai5();
		Tipai5 b = new Tipai5();
		Tipai5 c = new Tipai5();
		Tipai5 d = new Tipai5();
		Tipai5 e = new Tipai5();

		System.out.println("statinis " +Tipai5.statinis);
		Tipai5.isvalyti();
		System.out.println( "statinis po isvalymo " +Tipai5.statinis);

	}

}
