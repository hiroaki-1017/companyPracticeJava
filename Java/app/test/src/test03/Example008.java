package test03;
import java.util.Scanner;

public class Example008 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MyCalc myCalc = new MyCalc();
		Scanner scan = new Scanner(System.in);
		System.out.println("計算式を入力してください。");
        System.out.println("(入力例：1 + 1)");
        System.out.println("数字と演算子は、半角スペースで区切って下さい。");
        System.out.println("足し算(+)引き算(-)掛け算(*)割り算(/)");
        System.out.println(">>");

        myCalc.num1 = scan.nextInt();
        myCalc.operator = scan.next();
        myCalc.num2 = scan.nextInt();

		myCalc.showResult();

	}

}
