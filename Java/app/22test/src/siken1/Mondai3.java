package siken1;

import java.util.Random;

public class Mondai3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int[] num1;
		int[] num2;

		num1 = new int[10];
		num2 = new int[10];

		Random rand = new Random();
		int sum;

		System.out.print("1�ڂ̔z��F");
		for (int i = 0; i < 10; i++) {
			num1[i] = rand.nextInt(100) + 0;
			System.out.print(num1[i] + " ");
		}
		System.out.print("\n");

		System.out.print("2�ڂ̔z��F");
		for (int i = 0; i < 10; i++) {
			num2[i] = rand.nextInt(100) + 0;
			System.out.print(num2[i] + " ");
		}
		System.out.print("\n");

		for (int i = 0; i < 10; i++) {
			sum = num1[i] + num2[i];
			System.out.println(num1[i] + "+" + num2[i] + "=" + sum);
		}
	}

}
