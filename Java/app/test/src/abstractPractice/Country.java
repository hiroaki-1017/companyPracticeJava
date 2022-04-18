package abstractPractice;

public abstract class Country {
	String country;

	Country(String country) {
		this.country = country;
	}

	abstract String setContinente();
	abstract String setCapital();

	public void introduce() {
		System.out.println("‘–¼F" + country);
		System.out.println("‘å—¤F" + setContinente());
		System.out.println("ñ“sF" + setCapital());
	}

}
