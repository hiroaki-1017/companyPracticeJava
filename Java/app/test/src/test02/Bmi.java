package test02;
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
        Example007 example007 = new Example007();
        Scanner scan = new Scanner(System.in);

        System.out.println("BMI�w���̔���v���O�����ł��B");
        System.out.println("�g��(cm) ����͂��Ă��������F");
        System.out.println(">>");
        example007.height = scan.nextInt();
        System.out.println("�̏d(kg) ����͂��Ă��������F");
        System.out.println(">>");
        example007.weight = scan.nextInt();

        example007.showBmi();
        scan.close();

    }

}
