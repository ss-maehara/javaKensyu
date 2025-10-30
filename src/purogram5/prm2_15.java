package purogram5;

import java.util.Scanner;

public class prm2_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_15();
	}

	public static void program2_15() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt(); //変数 

		if (inputNum % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
	}
}
