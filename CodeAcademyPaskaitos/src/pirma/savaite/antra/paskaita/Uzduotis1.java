package pirma.savaite.antra.paskaita;

public class Uzduotis1 {

	public static void main(String[] args) {

		int pirmas = -19;
		int antras = 40;

		int rezultatas1 = pirmas + antras;
		int rezultatas2 = pirmas - antras;
		int rezultatas3 = pirmas / antras;
		int rezultatas4 = pirmas * antras;
		int rezultatas5 = pirmas % antras;
		String A = "sudeje du skaicius -19 ir 40 gauname:";
		String B = "ateme is -19 skaiciu 40 gauname:";
		String C = "padaline -19 is 40 gauname:";
		String D = "padaugine-19 is 40 gauname:";
		String E = "-19 skaiciaus procentine liekana is 40 yra:";

		System.out.println(A + rezultatas1);
		System.out.println(B + rezultatas2);
		System.out.println(C + rezultatas3);
		System.out.println(D + rezultatas4);
		System.out.println(E + rezultatas5);

	}
}
