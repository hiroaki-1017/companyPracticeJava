package test;

import java.util.Scanner;

public class Example009 {

    //�R���X�g���N�^
	Example009() {

        Scanner scan = new Scanner(System.in);
        int num;
        String answer;
        String[] question = { "", "����ɂ���", "���@���͂������ł����H", "�J���[�͍D���ł����H", "�����Ă��܂��B", "���悤�Ȃ�B","���`", "����", "�悢����"};

        System.out.println("���Ȃ���RISI��8�̌��t���������܂��B");
        System.out.println("RISI�ɂ����錾�t��ԍ��őI�����Ă��������i1�` 8�j");
        System.out.println("5��I������ƃv���O�������I�����܂��B");
        System.out.println("1: " + question[1]);
        System.out.println("2: " + question[2]);
        System.out.println("3: " + question[3]);
        System.out.println("4: " + question[4]);
        System.out.println("5: " + question[5]);
        System.out.println("6: " + question[6]);
        System.out.println("7: " + question[7]);
        System.out.println("8: " + question[8]);

        while (true) {

            System.out.print("����̔ԍ���I�����Ă�������>>");
            num = scan.nextInt();

            answer = risi(num);
            // question�̓Y�����ŗ��p�ł���悤�A
            // ���͂��ꂽ�l��0�����A�܂���5���傫���l�͂��ׂ�0�ɂ���B
            if(num < 0 || num > 8){
                num = 0;
            }

            System.out.println("���Ȃ��F" + question[num]);
            System.out.println("RISI�F" + answer);
            System.out.print("\n\n");

            if (num == 7) {

                break; //break��while�����I��点�閽�߂ł��B

            }

        }

    }

    public static void main(String[] args) {

    	Example009 test = new Example009();

    }

    public String risi(int num) {

        if (num == 1) {

            return "����ɂ���A�ǂ����V�C�ł���(^_^)";

        } else if (num == 2) {

        	return "���������C�ł��I";

        } else if (num == 3) {

        	return "�h���̂��D���B";

        } else if (num == 4) {

        	return "�݂Ȃ���ɂ�������������Ă��ł��ˁH";

        } else if (num == 5) {

        	return "��������悤�`";

        } else if (num == 6) {

        	return "�ǂ�܁`��";

        } else if (num == 7) {

        	return "�ؕ�������񂾂�";

        } else if (num == 8) {

        	return "�͂��`�`";

        } else {

        	return "���H�Ȃ�Ƃ������Ⴂ�܂������H";

        }

    }

}