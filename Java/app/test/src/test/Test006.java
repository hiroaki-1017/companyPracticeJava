package test;

import java.util.Scanner;

public class Test006 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner scan = new Scanner(System.in);
        System.out.print("��������͂��Ă�������");

        int num = scan.nextInt();
        int count = 0;
        scan.close();

        // �}�`��`��
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num ; j++) {
            	count = j;
            	if(j == 0){
            		System.out.print("��"); // ����
            	} else if(i == num - 1){
            		System.out.print("��"); // ����
            	} else if(count == i && count == j){
            		System.out.print("��");
            	} else {
            		System.out.print("��");
            	}
            }

        System.out.println(); // ���s

        }
	}

}