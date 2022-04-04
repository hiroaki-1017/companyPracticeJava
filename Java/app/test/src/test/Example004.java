package test;

public class Example004 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kokugo = 80;
		int syakai = 80;
		int rika = 80;
		int sansu = 70;
		int bunkei;
		int rikei;
		int totalAverage;

		bunkei = (kokugo + syakai) / 2;
		rikei = (rika + sansu) / 2;
		totalAverage = (kokugo + syakai + rika + sansu) / 4;

		if(kokugo >= 80 && syakai >= 80 && rika >= 80 && sansu >= 80) {
			System.out.println("優秀な生徒です");
		} else if(bunkei >= 80) {
			System.out.println("文系に適性があります。");
		} else if(rika >= 80) {
			System.out.println("理系に適性があります。");
		}

		if(totalAverage >= 65) {
			System.out.print("よく健闘されています。");
		} else {
			System.out.print("もう少し学習を工夫しましょう。");
		}

	}

}
