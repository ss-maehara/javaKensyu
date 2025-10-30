package purogram5;

import java.util.Scanner;

public class prm2_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_14();
	}
	public static void program2_14() {
		Scanner scanner = new Scanner(System.in);
		int inputNumA = scanner.nextInt();
		int inputNumB = scanner.nextInt();
		
		if(inputNumA == 2 && inputNumB == 7 || inputNumA == 7 && inputNumB == 2) {
			System.out.println("正しい数字");
		}else {
			System.out.println("不正の数字");
		}
		
	}
}
