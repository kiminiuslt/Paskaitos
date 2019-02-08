package ketvirta.savaite.antra.paskaita;

public class StaticTestFinal {
	public static int sk1;
	public static int sk2;

	public void priskirk(int skaicius, int skaiciukas) {

		sk1 = skaicius;
		sk2 = skaiciukas;
		System.out.println(skaicius + " ir " + skaiciukas);

	}
}
