package purogram5;

import java.util.Scanner;

public class prm2_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_19();
	}

	public static void program2_19() {
		Scanner scanner = new Scanner(System.in);
		String inputFruitName = scanner.next(); //変数名変更

		if (inputFruitName.equals("apple") || inputFruitName.equals("orenge")) {
			System.out.println("果物です");
		}
	}
}
