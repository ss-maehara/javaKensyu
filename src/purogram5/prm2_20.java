package purogram5;

import java.util.Scanner;

public class prm2_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void program2_20() {
		Scanner scanner = new Scanner(System.in);
		int intputNum = scanner.nextInt(); //変数名

		if (intputNum % 3 == 0 && intputNum % 5 == 0) {
			System.out.println(intputNum + "は15の倍数です");

		}
	}
}
