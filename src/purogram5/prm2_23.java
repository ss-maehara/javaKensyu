
package purogram5;

import java.util.Scanner;

public class prm2_23 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_23();
	}

	public static void program2_23() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("A:");
		int inputNumA = scanner.nextInt();
		System.out.print("B:");
		int inputNumB = scanner.nextInt();
		if (inputNumA == inputNumB) {
			System.out.println(inputNumA + "と" + inputNumB + "は等しいです");
		} else {
			System.out.println(inputNumA + "と" + inputNumB + "は等しくない");

		}
	}

}
