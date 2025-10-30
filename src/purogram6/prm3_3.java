package purogram6;

public class prm3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_3();
	}

	public static void program3_3() {
		int num = 0;

		countNum(num);
		System.out.println("\n");
		whileCountNum(num);
	}

	/**
	 * 10～20までカウントし出力する。
	 * @param numCount 数字
	 */
	public static void countNum(int numCount) {
		for (numCount = 10; numCount <= 20; numCount++) {
			System.out.println(numCount);

		}

	}

	//whileバージョン
	public static void whileCountNum(int whileNumCount) {
		for (whileNumCount = 10; whileNumCount <= 20; whileNumCount++) {
			System.out.println(whileNumCount);

		}
	}
}
