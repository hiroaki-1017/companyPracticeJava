package test;

import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scan = new Scanner(System.in);
        System.out.print("��������͂��Ă�������");

        int num = scan.nextInt();
        int count = 0;
        scan.close();

        // �}�`��`��
        for(int i = 0; i < num; i++) {
        	count ++;

            for(int j = 0; j < count; j++) {
                System.out.print("��");
            }

        System.out.println(); // ���s

        }
	}

}