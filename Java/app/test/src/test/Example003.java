package test;

public class Example003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int apple = 63;
		int orange = 49;
		double tax = 0.08;
		int coffe = 130;

		double appleTotal = (apple + (apple * tax))*12;
		double orangeTotal = (orange + (orange * tax))*24;

		int change = (int)(10000 - (appleTotal + orangeTotal + coffe));

		System.out.print("お釣りは" + change + "です。");


	}

}
