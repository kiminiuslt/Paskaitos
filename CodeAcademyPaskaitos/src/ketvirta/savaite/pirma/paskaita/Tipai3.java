package ketvirta.savaite.pirma.paskaita;

// konstruktoriaus pavizdys
public class Tipai3 {

	private String reiksme;

	public Tipai3() {

		reiksme = "laba diena";

	}

	public Tipai3(String parametras) {

		reiksme = parametras;

	}

	public void parodyk() {

		System.out.println(reiksme);
	}

}
