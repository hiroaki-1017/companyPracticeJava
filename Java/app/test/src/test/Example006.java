package test;

public class Example006 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int[] num = new int[10];

        //�z��Ƀ����_���ɐ������i�[
        for (int i = 0; i < 10; i++) {

            num[i] = (int) (Math.random() * 100 + 1);

        }

        //��������i�[���ꂽ�l��\��
        System.out.println("Sort�O�̔z��");

        for (int i = 0; i < 10; i++) {

            System.out.print("num[i] ");

        }

        //////Sort���/////
        //�ꎟ�ޔ�p�ϐ�
        int temp;

        for (int i = num.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                //�召����
                if (num[j] < num[j + 1]) {

                    //�����傫���Ȃ獶�E����ւ�
                    temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;

                }

            }

        }

        System.out.println();

        //Sort��
        System.out.println("Sort��̔z��");

        for (int i = 0; i < 10; i++) {

            System.out.print(num[i] + " ");

        }

	}

}