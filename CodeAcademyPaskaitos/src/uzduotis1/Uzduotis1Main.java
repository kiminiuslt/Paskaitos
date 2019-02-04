package uzduotis1;

import java.util.Scanner;

public class Uzduotis1Main {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);

		Asmuo[] asmenuMasyvas = new Asmuo[5]; // masyvo deklaravimas

//		asmenuMasyvas[0] = new Asmuo(); // objektas deklaravimas

		for (int i = 0; i < 5; i++) {

			asmenuMasyvas[i] = new Asmuo();
		}
		//for (int i = 0; i < 5; i++) {

		//	asmenuMasyvas[i].vardas = skan.nextLine();
		//	asmenuMasyvas[i].gimimoMetai = skan.nextInt();
		//}
		 asmenuMasyvas[0].gimimoMetai = 20;
		 asmenuMasyvas[1].gimimoMetai = 22;
		 asmenuMasyvas[2].gimimoMetai = 25;
		 asmenuMasyvas[3].gimimoMetai = 29;
		 asmenuMasyvas[4].gimimoMetai = 30;

		 asmenuMasyvas[0].vardas = "Tomas";
		 asmenuMasyvas[1].vardas = "Jonas";
		 asmenuMasyvas[2].vardas = "Tadas";
		 asmenuMasyvas[3].vardas = "Algis";
		 asmenuMasyvas[4].vardas = "Haris";

		 asmenuMasyvas[0].spausdink();
		 asmenuMasyvas[1].spausdink();
		 asmenuMasyvas[2].spausdink();
		 asmenuMasyvas[3].spausdink();
		 asmenuMasyvas[4].spausdink();

	}

}
