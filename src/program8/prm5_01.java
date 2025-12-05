package program8;

import java.util.Date;

public class prm5_01 {

	public static void main(String[] args) {
		program5_1();
	}

	public void test() {
		System.out.print("TEST");
	}

	public static void program5_1() {

	}

	/*
	public static int inputNum() {
		int intputNum = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("入力:");
			//入力
			intputNum = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("数字を入力してください。");
		}
		return intputNum;
	}
	*/

	/**12/1
	 * 数値を文字列に変えて返す
	 * @param input 入力数字
	 * @return 文字列
	 */
	public String InputNumberToString(int input) {
		switch (input) {
		case 1:
			return "グー";
		case 2:
			return "チョキ";
		case 3:
			return "パー";
		default:
			return "エラー";
		}
	}

	public void testTime() {
		Date date = new Date();
		System.out.println(date);
	}
}