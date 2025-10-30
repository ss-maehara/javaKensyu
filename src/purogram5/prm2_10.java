package purogram5;

import java.util.Scanner;

public class prm2_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_10();
	}

	public static void program2_10() {
		Scanner scanner = new Scanner(System.in);
		String animalName = scanner.next();

		if (animalName.equals("いぬ") || animalName.equals("わん")) {
			System.out.println("正しいです。");
		}
	}
}
