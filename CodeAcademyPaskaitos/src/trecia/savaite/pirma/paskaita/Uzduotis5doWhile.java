package trecia.savaite.pirma.paskaita;

import java.util.Scanner;

public class Uzduotis5doWhile {

	public static void main(String[] args) {
		
		Scanner skan = new Scanner(System.in);
		int s;
		
		do {
		System.out.println("iveskite lygini skaiciu");
		
		s = skan.nextInt();
		
		
		
		}		while(s % 2 != 0); // liekana padalinus is 2
		
		System.out.println( "ivestas skaicius " + s);
		
		skan.close();
		

	}

}
