package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			File file = new File("C:\\Users\\hiroaki.yamada\\Desktop\\test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("ファイルが読み込めないよ");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			System.out.println("出力できないね！");
		}


	}

}
