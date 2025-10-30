package purogram5;

import java.util.Scanner;

public class prm2_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_21();
	}

	public static void program2_21() {
		Scanner scanner = new Scanner(System.in);
		int inputNumA = scanner.nextInt();
		int inputNumB = scanner.nextInt();

		if (inputNumA > inputNumB) {
			System.out.println(inputNumA + "は" + inputNumB + "より大きいです");
		} else if (inputNumA < inputNumB) {
			System.out.println(inputNumA + "は" + inputNumB + "より小さいです");
		}
	}
}
