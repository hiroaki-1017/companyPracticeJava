package test;

import java.util.Scanner;

public class Test005 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください");

        int num = scan.nextInt();
        scan.close();

        // 図形を描く
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num ; j++) {
            	if(i == 0) {
            		System.out.print("●"); // 上辺
            	} else if(j == num - 1){
            		System.out.print("●"); // 右辺
            	} else if(j == 0){
            		System.out.print("●"); // 左辺
            	} else if(i == num - 1){
            		System.out.print("●"); // 下辺
            	} else if(i == j){
            		System.out.print("●");
            	} else if(i + j == num-1){
            		System.out.print("●");
            	} else {
            		System.out.print("○");
            	}
            }

        System.out.println(); // 改行

        }
	}

}
