package test;

import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください");

        int num = scan.nextInt();
        int count = 0;
        scan.close();

        // 図形を描く
        for(int i = 0; i < num; i++) {
        	count ++;

            for(int j = 0; j < count; j++) {
                System.out.print("○");
            }

        System.out.println(); // 改行

        }
	}

}
