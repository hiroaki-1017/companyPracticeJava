package test;
import java.util.Scanner;

 public class Test009 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください");

        int num = scan.nextInt();
        scan.close();

        // 図形を描く
        for(int i = 0; i < num; i++) {

            for(int j = 0; j < num; j++) {

                if(j >= i) {
                    System.out.print("○");

                } else {
                	System.out.print("");
                }

            }

            System.out.println(); // 改行

        }

    }

}