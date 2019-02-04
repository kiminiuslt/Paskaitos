package pirma.savaite.antra.paskaita;

import java.util.Scanner;

public class Uzduotis3 {

	public static void main(String[] args) {
		
		Scanner skanuoklis  = new Scanner(System.in);
		System.out.println("irasykite a krastine");
		
		int a = skanuoklis.nextInt();
		
		System.out.println("irasykite b krastine");
		
		int b = skanuoklis.nextInt();
		
		System.out.println("staciakampio plotas lygus " + a * b);
		System.out.println("staciakampio perimetras lygus " + (a + a + b + b));
			
		skanuoklis.close();
		
	}
}
