package antra.savaite.pirma.paskaita;

import java.util.Scanner;

public class StringUzduotis1 {

	public static void main(String[] args) {
		
		System.out.println("Iveskite savo varda ir pavarde.");
		
		Scanner vardasPavarde = new Scanner(System.in);
		
		String a = vardasPavarde.nextLine();
		
		
		System.out.println("Iveskite programavimo kalba.");
		Scanner programavimoKalba = new Scanner(System.in);
		
		String b = programavimoKalba.nextLine();
		
		System.out.println("Iveskite savaiciu skaiciu.");
		
		Scanner savaiciuSkaicius = new Scanner(System.in);
		
		int c = savaiciuSkaicius.nextInt();
		
		System.out.println("As " + a + ", tikrai ismoksiu programuoti " + b + " kalba per " + c + " savaites.");
		
		
		
		
		
		

	}
}
