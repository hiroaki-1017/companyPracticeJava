package test;

import java.util.Scanner;

public class Example005 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = (int)(Math.random() * 10 + 1);
		int human = -1;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		while(human != num) {
			System.out.println("0から9までの数値を入力してください。");
			human = scan.nextInt();

			if(human != num) {
				System.out.println("残念！");
		        count++;

			} else if(human == num) {
				System.out.println("あたり!");
				scan.close();
				break;
			}

			if(count == 3) {
				System.out.println("あなたの負けです。");
				break;
			}
		}

	}

}
