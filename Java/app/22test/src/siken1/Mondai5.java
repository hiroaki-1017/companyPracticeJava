package siken1;

import java.util.Scanner;

public class Mondai5 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scanner = new Scanner(System.in);
		boolean flg = true;

		while (flg) {
			String word = scanner.next();
			switch (word) {
			case "moning":
				System.out.println("���͂悤�������܂�");
				flg = true;
				break;

			case "hello":
				System.out.println("����ɂ���");
				flg = true;
				break;

			case "evening":
				System.out.println("����΂��");
				flg = true;
				break;

			case "bye":
				System.out.println("���悤�Ȃ�");
				flg = false;
				break;

			default:
				System.out.println("�����ł��܂���");
				break;
			}
		}
	}

}
