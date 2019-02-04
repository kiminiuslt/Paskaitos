package trecia.savaite.antra.paskaita;

import java.util.Random;
import java.util.Scanner;

public class Uzduotis0 {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		
		int parodytVartotojuj = 0;

		System.out.println(" pasirinkite veiksma ");
		System.out.println("A - sugeneruoti atsitiktini skaiciu 1-100");
		System.out.println("B - sugeneruoti 10 atsitiktiniu skaiciu");
		System.out.println("E - baigti darba");
		// while
		String pasirinkimas = skan.next();

		sugeneruotas100();
		sugeneruotas10();
		

	}

	private static int sugeneruotas10() {
		
			Random atsitiktinis = new Random();
			int skaicius = atsitiktinis.nextInt(99)+1;
			
			return skaicius;
		
	}

	private static int sugeneruotas100() {
		Random atsitiktinis = new Random();
		int skaicius = atsitiktinis.nextInt(99)+1;
		
		return skaicius;

	}

}
