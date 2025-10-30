package purogram5;

import java.util.Scanner;

public class prm2_24 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_24();
	}

	public static void program2_24() {
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.next();

		/*
		 * 文字数が4文字以上で
		 * 最初の2文字目が「ね」 かつ 最後の2文字目が「こ」
		 * のときは「ねこ」と表示する。
		 * ifを分ける
		 */
		if (inputName.length() == 1) {
			System.out.println(inputName + inputName);

		} else if (inputName.charAt(1) == 'ね' && inputName.charAt(inputName.length() - 2) == 'こ') {
			System.out.println("ねこ");

		} else {
			//1文字目と最後の文字をくっつける
			String str2 = inputName.substring(inputName.length() - 1);
			System.out.println(inputName.charAt(0) + str2);
		}
	}
}
