package test;

import java.util.Scanner;

public class Test007 {

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
            	if(i == 0) {
            		System.out.print("●"); // 上辺
            	} else if(j == 0){
            		System.out.print("●"); // 左辺
            	} else if(j == count){
            		System.out.print("●"); // 左辺
            	} else {
            		System.out.print("○");
            	}
            }

        System.out.println(); // 改行

        }
	}

}
