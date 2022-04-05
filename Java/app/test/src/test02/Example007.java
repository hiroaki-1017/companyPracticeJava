package test02;

public class Example007 {

		double weight;
	    double height;
	    double bmi;
	    double tekiseiWeight;
	    boolean bool = true;

	    void showBmi() {
	    	System.out.println(height);
	    	bmi = weight / (height * height);
	    	System.out.println(bmi);
	    	tekiseiWeight = (height * height) * 22;
	    	System.out.println(tekiseiWeight);
	    }

}
