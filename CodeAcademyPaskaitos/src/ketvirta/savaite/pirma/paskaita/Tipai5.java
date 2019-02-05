package ketvirta.savaite.pirma.paskaita;

public class Tipai5 {

	public int nestatinis;
	public static int statinis;

	public Tipai5() { // konsruktoriaus pavadinimas sutampa su klases

		System.out.println("nestatinis " +nestatinis);
		nestatinis++;
		System.out.println("statinis " +statinis);
		statinis++;

	}

	public static void isvalyti() {
		System.out.println("stainis pries isvalyma " + statinis);

		statinis = 0;

	}
}
