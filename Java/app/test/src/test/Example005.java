package test;

import java.util.Scanner;

public class Example005 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int num = (int)(Math.random() * 10 + 1);
		int human = -1;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		while(human != num) {
			System.out.println("0����9�܂ł̐��l����͂��Ă��������B");
			human = scan.nextInt();

			if(human != num) {
				System.out.println("�c�O�I");
		        count++;

			} else if(human == num) {
				System.out.println("������!");
				scan.close();
				break;
			}

			if(count == 3) {
				System.out.println("���Ȃ��̕����ł��B");
				break;
			}
		}

	}

}