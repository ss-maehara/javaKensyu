package purogram5;

import java.util.Scanner;

public class prm2_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_13();
	}

	public static void program2_13() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		if (inputNum >= -7 && inputNum <= 7) {
			System.out.println("正しい数字");
		} else {
			System.out.println("不正の数字");
		}
	}
}
