package test;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scan = new Scanner(System.in);
        System.out.print("��������͂��Ă�������");

        int num = scan.nextInt();
        int count = num;
        scan.close();

        // �}�`��`��
        for(int i = 0; i < num; i++) {
        	count --;

            for(int j = 0; j < count + 1; j++) {
                System.out.print("��");
            }

        System.out.println(); // ���s

        }
	}

}