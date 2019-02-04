package pirma.savaite.antra.paskaita;

public class Masyvai1 {

	public static void main(String[] args) {
		String []draugai= new String[5];
		draugai[0] = "Tadas";
		draugai[1] = "Jonas";
		draugai[2] = "Ignas";
		draugai[3] = "Linas";
		draugai[4] = "Osvaldas";
		
		System.out.println("masyvo ilgis " + draugai.length);
		System.out.println("pirmas draugas " + draugai[0]);
		System.out.println("paskutinis draugas " + draugai[draugai.length - 1]);
		System.out.println("visu draugu sarasas:");
		System.out.println(draugai[0]);
		System.out.println(draugai[1]);
		System.out.println(draugai[2]);
		System.out.println(draugai[3]);
		System.out.println(draugai[4]);
		
		

	}
}
