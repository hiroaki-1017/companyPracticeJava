package siken1;

import java.util.Random;

public class Mondai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		int num, sum = 0;

		for (int i = 0; i < 10; i++) {
			num = rand.nextInt(10) + 100;
			System.out.println(num);
			sum += num;
		}

		System.out.println(sum);
	}

}
