package test03;
import java.util.Scanner;

public class Example008 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		MyCalc myCalc = new MyCalc();
		Scanner scan = new Scanner(System.in);
		System.out.println("�v�Z������͂��Ă��������B");
        System.out.println("(���͗�F1 + 1)");
        System.out.println("�����Ɖ��Z�q�́A���p�X�y�[�X�ŋ�؂��ĉ������B");
        System.out.println("�����Z(+)�����Z(-)�|���Z(*)����Z(/)");
        System.out.println(">>");

        myCalc.num1 = scan.nextInt();
        myCalc.operator = scan.next();
        myCalc.num2 = scan.nextInt();

		myCalc.showResult();

	}

}