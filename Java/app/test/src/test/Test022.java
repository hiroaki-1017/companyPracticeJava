package test;
import java.util.Scanner;

public class Test022 {

	String[][] str;
    int num, num2;

    Test022() {

        Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください>>");
        num = scan.nextInt();
        scan.close();

        //配列の縦の大きさを計算
        num2 = num * 2 - 1;
        //配列を作成
        str = new String[num2][num];
        //配列を初期化（全ての部屋に全角スペースを埋める）
        init();
        //配列に○を埋め込む
        makeShape();
        //表示
        show();
    }

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Test022 test = new Test022();
	}

	void init() {
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < num; j++) {

                str[i][j] = "　"; //全角スペースを代入

            }

		}
	}

	void makeShape() {
		for(int i = 0,  a = num - 1; i < num2; i++, a--) {
			for (int j = 0;  j <= num - Math.abs(a); j++) {
                str[i][j] = "〇"; //全角スペースを代入

            }
		}
	}

	void show() {
		for (int i = 0; i < num2; i++) {

            for (int j = 0; j < num; j++) {

                System.out.print(str[i][j]);

            }

            System.out.println();

        }
	}

}
