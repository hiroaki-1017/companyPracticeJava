package abstractPractice;

public abstract class Country {
	String country;

	Country(String country) {
		this.country = country;
	}

	abstract String setContinente();
	abstract String setCapital();

	public void introduce() {
		System.out.println("�����F" + country);
		System.out.println("�嗤�F" + setContinente());
		System.out.println("��s�F" + setCapital());
	}

}
