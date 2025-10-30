package purogram6;

import java.util.Scanner;

public class prm3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_1();
	}

	public static void program3_1() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		//入力した数字だけねこちゃんと表示する。
		String catNum = inputNumCat(inputNum);
		System.out.println(catNum);

		String whileCat = whileInputNumCat(inputNum);
		System.out.println(whileCat);
	}

	//入力した数だけねこを表示する。
	public static String inputNumCat(int inputNumCat) {
		String result = "";
		for (int i = 0; i < inputNumCat; i++) {
			result += "ねこちゃん\n";
		}
		return result;

	}

	public static String whileInputNumCat(int inputNumCat) {
		int i = 0;
		String result = "";
		while (i < inputNumCat) {
			result += "ねこちゃん\n";
			i++;
		}
		return result;

	}
}
