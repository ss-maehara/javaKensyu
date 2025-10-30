package purogram5;

import java.util.Scanner;

public class prm2_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_8();
	}

	public static void program2_8() {
		Scanner scanner = new Scanner(System.in);
		String AnimalName = scanner.next();

		if (AnimalName.equals("いぬ")) {
			System.out.println("わんわん");
		} else if (AnimalName.equals("きつね")) {
			System.out.println("こんこん");
		} else {
			System.out.println("該当なし");
		}
	}
}
