package test;

public class Example004 {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		int kokugo = 80;
		int syakai = 80;
		int rika = 80;
		int sansu = 70;
		int bunkei;
		int rikei;
		int totalAverage;

		bunkei = (kokugo + syakai) / 2;
		rikei = (rika + sansu) / 2;
		totalAverage = (kokugo + syakai + rika + sansu) / 4;

		if(kokugo >= 80 && syakai >= 80 && rika >= 80 && sansu >= 80) {
			System.out.println("�D�G�Ȑ��k�ł�");
		} else if(bunkei >= 80) {
			System.out.println("���n�ɓK��������܂��B");
		} else if(rika >= 80) {
			System.out.println("���n�ɓK��������܂��B");
		}

		if(totalAverage >= 65) {
			System.out.print("�悭��������Ă��܂��B");
		} else {
			System.out.print("���������w�K���H�v���܂��傤�B");
		}

	}

}
