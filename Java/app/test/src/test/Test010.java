import java.util.Scanner;

 public class Test010 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("��������͂��Ă�������");

        int num = scan.nextInt();
        scan.close();

        // �}�`��`��
        for(int i = 0; i < num; i++) {

            for(int j = 0; j < num; j++) {

                if (i + j >= num -1) {

                    System.out.print("��");

                } else {

                    System.out.print("");

                }

            }

            System.out.println(); // ���s

        }

    }

}