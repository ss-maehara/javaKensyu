package purogram6;

import java.util.Scanner;

public class prm3_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_11();
	}

	public static void program3_11() {
		Scanner scanner = new Scanner(System.in);
		String inputCat = scanner.next();

		judgCat(inputCat, scanner);
		forJudgCat(inputCat, scanner);
	}

	public static void judgCat(String inputJudgCat, Scanner scanner) {

		while (!inputJudgCat.equals("ねこ")) {
			inputJudgCat = scanner.next();
		}
		System.out.println("通常");

	}

	public static void forJudgCat(String inputJudgCat, Scanner scanner) {

		for (; !inputJudgCat.equals("ねこ");) {
			inputJudgCat = scanner.next();
		}

		System.out.println("通常");
	}
}
