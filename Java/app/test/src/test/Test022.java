package test;
import java.util.Scanner;

public class Test022 {

	String[][] str;
    int num, num2;

    Test022() {

        Scanner scan = new Scanner(System.in);
        System.out.print("��������͂��Ă�������>>");
        num = scan.nextInt();
        scan.close();

        //�z��̏c�̑傫�����v�Z
        num2 = num * 2 - 1;
        //�z����쐬
        str = new String[num2][num];
        //�z����������i�S�Ă̕����ɑS�p�X�y�[�X�𖄂߂�j
        init();
        //�z��Ɂ��𖄂ߍ���
        makeShape();
        //�\��
        show();
    }

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		 Test022 test = new Test022();
	}

	void init() {
		for(int i = 0; i < num2; i++) {
			for (int j = 0; j < num; j++) {

                str[i][j] = "�@"; //�S�p�X�y�[�X����

            }

		}
	}

	void makeShape() {
		for(int i = 0,  a = num - 1; i < num2; i++, a--) {
			for (int j = 0;  j <= num - Math.abs(a); j++) {
                str[i][j] = "�Z"; //�S�p�X�y�[�X����

            }
		}
	}

	void show() {
		for (int i = 0; i < num2; i++) {

            for (int j = 0; j < num; j++) {

                System.out.print(str[i][j]);

            }

            System.out.println();

        }
	}

}
