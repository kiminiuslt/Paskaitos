package trecia.savaite.pirma.paskaita;

import java.util.Random;

// nebaigta uzduotis

public class Uzduotis9For {

	public static void main(String[] args) {

		int[] masyvas = new int[99];
		int maziausias = 1000;
		int didziausias = 0;
		int suma = 0;
		int vidurkis = suma / masyvas.length;
		int didesniMasyvai = 0;

		Random random = new Random();

		for (int a = 0; a < 99; a++) {

			masyvas[a] = random.nextInt(1000);

		}

		for (int m = 0; m < masyvas.length; m++) {

			if (masyvas[m] < maziausias) {

				maziausias = masyvas[m];
			}
		}
		for (int m = 0; m < masyvas.length; m++) {

			if (masyvas[m] > didziausias) {

				didziausias = masyvas[m];
			}
		}
		for (int m = 0; m < masyvas.length; m++) {

			suma = suma + masyvas[m];
		}
		for (int m = 0; m < masyvas.length; m++) {

			if (masyvas[m] == 500) {
				System.out.println("pirmas elementas 500 indeksas " + m);
				break;

			}
		}
		for (int m = 0; m < masyvas.length; m++) {

			if(masyvas[m] <= 500) { 
			continue;
		//	didesniMasyvai = masyvas[m];
			
			
			
			}
			
		}

		System.out.println(maziausias);
		System.out.println(didziausias);
		System.out.println(suma);
		System.out.println(vidurkis);
		System.out.println(didesniMasyvai);
		

	}
}
