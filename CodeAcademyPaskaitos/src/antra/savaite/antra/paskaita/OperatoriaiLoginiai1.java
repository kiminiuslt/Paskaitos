package antra.savaite.antra.paskaita;

import java.util.Scanner;

public class OperatoriaiLoginiai1 {

	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {

		Scanner skan = new Scanner(System.in);
		System.out.println("iveskite pirma reiksme");
		int sk1 = skan.nextInt();
		System.out.println("iveskite antra reiksme");
		int sk2 = skan.nextInt();
		System.out.println("iveskite trecia reiksme");
		int sk3 = skan.nextInt();
		a = sk1;
		b = sk2;
		c = sk3;

		boolean arReiksmesLygios = ((sk1 == sk2) && sk1 == sk3);
		
	//	result = someCondition ? value1 , value2;
		
		// intTest = a > b ? c : d;
				
		System.out.println(arReiksmesLygios);
		
		

		if (arReiksmesLygios) {
			System.out.println("visos reiksmes lygios");
			arIvesta();

		}

		else {
			System.out.println("reiksmes nera lygios");

			boolean arIvesta10 = ((sk1 == 10) || (sk2 == 10) || (sk3 == 10));
			
			if (arIvesta10) {
				System.out.println("viena reiksme lygi 10");
			} else {
				System.out.println("nei viena reiksme nera lygi 10");
			}
		}
	}

	private static void arIvesta() {
		boolean arIvesta10 = ((a == 10) || (b == 10) || (c == 10));
		if (arIvesta10) {
			System.out.println("viena reiksme lygi 10");
		} else {
			System.out.println("nei viena reiksme nera lygi 10");
		}

	}

}
