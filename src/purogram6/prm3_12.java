package purogram6;

import java.util.Scanner;

public class prm3_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_12();
	}

	public static void program3_12() {
		Scanner scanner = new Scanner(System.in);
		String inputHand = scanner.next();

		//handJudg(inputHand, scanner);
		forHandjudg(inputHand, scanner);
	}

	public static void handJudg(String inputHand, Scanner scanner) {

		while (!inputHand.equals("グー") && !inputHand.equals("チョキ") && !inputHand.equals("パー")) {
			inputHand = scanner.next();
		}
		System.out.println("自分の出した手は" + inputHand + "です。");
	}

	public static void forHandjudg(String inputHand, Scanner scanner) {
		inputHand = scanner.next();
		for (;;) {
			if (inputHand.equals("グー") || inputHand.equals("チョキ") || inputHand.equals("パー")) {
				break;
			}
			inputHand = scanner.next();

		}
		System.out.println("自分の出した手は" + inputHand + "です。");
	}
}
