package abstractPractice;

public class America extends Country {

	America() {
		super("アメリカ合衆国");
	}

	@Override
    String setContinente() {
		return "北アメリカ大陸";
    }

	String setCapital() {
		return "ワシントン";
    }



}
