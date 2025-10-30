package purogram5;

import java.util.Scanner;

public class prm2_11 {

	//赤黄青が入力されたら信号機と出力
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_11();
	}

	public static void program2_11() {
		Scanner scanner = new Scanner(System.in);
		String color = scanner.next();

		if (color.equals("赤黄青")) {
			System.out.println("信号機");
		}

	}
}
