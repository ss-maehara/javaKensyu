package purogram7;

import java.util.Scanner;

public class prm4_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_05();
	}

	public static void program4_05() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		String str = checkDivisible(inputNum);
		System.out.println(str);

	}

	public static String checkDivisible(int num) {
		if (num % 5 == 0) {
			return "割り切れる";
		} else {
			return "割り切れない";
		}
	}
}
