package ketvirta.savaite.antra.paskaita;

public class StudentData {

	private final int studentoId;
	private String vardas;
	private final int metai;

	StudentData(int id, String Vvardas, int m) {

		studentoId = id;
		vardas = Vvardas;
		metai = m;

	}

	public void spausdink() {
		System.out.println(studentoId + vardas + metai);

	}

	public int duokGimimoMets() {

		return metai;
	}

	public String getterVardas() {
		return vardas;
	}

	public int gettterId() {

		return studentoId;
	}

}
