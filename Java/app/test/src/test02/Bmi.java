package test02;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
        Example007 example007 = new Example007();
        Scanner scan = new Scanner(System.in);

        System.out.println("BMI指数の判定プログラムです。");
        System.out.println("身長(cm) を入力してください：");
        System.out.println(">>");
        example007.height = scan.nextInt();
        System.out.println("体重(kg) を入力してください：");
        System.out.println(">>");
        example007.weight = scan.nextInt();

        example007.showBmi();
        scan.close();

    }

}
