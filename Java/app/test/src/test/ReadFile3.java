package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u

		try {
			File file = new File("C:\\Users\\hiroaki.yamada\\Desktop\\test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO �����������ꂽ catch �u���b�N
			System.out.println("�t�@�C�����ǂݍ��߂Ȃ���");
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			System.out.println("�o�͂ł��Ȃ��ˁI");
		}


	}

}
