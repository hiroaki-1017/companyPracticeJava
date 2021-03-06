package test;

import java.util.Scanner;

public class Example009 {

    //コンストラクタ
	Example009() {

        Scanner scan = new Scanner(System.in);
        int num;
        String answer;
        String[] question = { "", "こんにちは", "ご機嫌はいかがですか？", "カレーは好きですか？", "愛しています。", "さようなら。","あ〜", "酒は", "よいしょ"};

        System.out.println("あなたはRISIに8つの言葉をかけられます。");
        System.out.println("RISIにかける言葉を番号で選択してください（1〜 8）");
        System.out.println("5を選択するとプログラムが終了します。");
        System.out.println("1: " + question[1]);
        System.out.println("2: " + question[2]);
        System.out.println("3: " + question[3]);
        System.out.println("4: " + question[4]);
        System.out.println("5: " + question[5]);
        System.out.println("6: " + question[6]);
        System.out.println("7: " + question[7]);
        System.out.println("8: " + question[8]);

        while (true) {

            System.out.print("質問の番号を選択してください>>");
            num = scan.nextInt();

            answer = risi(num);
            // questionの添え字で利用できるよう、
            // 入力された値が0未満、または5より大きい値はすべて0にする。
            if(num < 0 || num > 8){
                num = 0;
            }

            System.out.println("あなた：" + question[num]);
            System.out.println("RISI：" + answer);
            System.out.print("\n\n");

            if (num == 7) {

                break; //breakはwhile文を終わらせる命令です。

            }

        }

    }

    public static void main(String[] args) {

    	Example009 test = new Example009();

    }

    public String risi(int num) {

        if (num == 1) {

            return "こんにちわ、良いお天気ですね(^_^)";

        } else if (num == 2) {

        	return "今日も元気です！";

        } else if (num == 3) {

        	return "辛いのが好き。";

        } else if (num == 4) {

        	return "みなさんにそうおっしゃってるんですね？";

        } else if (num == 5) {

        	return "ごきげんよう〜";

        } else if (num == 6) {

        	return "どんま〜い";

        } else if (num == 7) {

        	return "筋分解するんだよ";

        } else if (num == 8) {

        	return "はぁ〜〜";

        } else {

        	return "え？なんとおっしゃいましたか？";

        }

    }

}
