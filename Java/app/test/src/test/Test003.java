package test;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください");

        int num = scan.nextInt();
        int count = num;
        scan.close();

        // 図形を描く
        for(int i = 0; i < num; i++) {
        	count --;

            for(int j = 0; j < count + 1; j++) {
                System.out.print("○");
            }

        System.out.println(); // 改行

        }
	}

}
