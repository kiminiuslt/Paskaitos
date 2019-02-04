package antra.savaite.pirma.paskaita;

public class Metodai7 {

	public static void main(String[] args) {
		
		// PERRASYT
		sudetis(10, 3);
		System.out.println(sudetis(2, 10));
		sudetis(0, 0, 0);
		sudetis(0, 0, 0, 0);
		sudetis(0, 0, 0, 0, 0);
	}

	private static int sudetis(int a, int b, int c, int d, int e) {
		int aaa = 5;
		int bbb = 6;
		int ddd = 10;
		int qqq = 15;
		int www = 30;
		int ccc = aaa + bbb + ddd + qqq + www;

		return ccc;
	}

	private static int sudetis(int a, int b, int c, int d) {

		int aaa = 5;
		int bbb = 6;
		int ddd = 10;
		int qqq = 15;
		int ccc = aaa + bbb + ddd + qqq;
		
		return ccc;
	}

	private static int sudetis(int a, int b, int c) {
		int aaa = 5;
		int bbb = 6;
		int ddd = 10;
		int ccc = aaa + bbb + ddd;

		return ccc;

	}

	private static int sudetis(int a, int b) {

		
		int ccc = a + b;

		return ccc;

	}
}
