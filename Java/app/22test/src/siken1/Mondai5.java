package siken1;

import java.util.Scanner;

public class Mondai5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		boolean flg = true;

		while (flg) {
			String word = scanner.next();
			switch (word) {
			case "moning":
				System.out.println("おはようございます");
				flg = true;
				break;

			case "hello":
				System.out.println("こんにちは");
				flg = true;
				break;

			case "evening":
				System.out.println("こんばんは");
				flg = true;
				break;

			case "bye":
				System.out.println("さようなら");
				flg = false;
				break;

			default:
				System.out.println("理解できません");
				break;
			}
		}
	}

}
