package ketvirta.savaite.pirma.paskaita;

public class Tipai4 {

	int neStatinis;
	static int statinis;

	public void setValue(int i) {

		System.out.println(i);

		neStatinis = i;

	}

	public static void staticMeethod(int j) {

		System.out.println(j);

		statinis = j;
	}

}
