package purogram6;

public class prm3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_3();
	}

	public static void program3_3() {

		countNum();
		System.out.println("\n");
		whileCountNum();
	}

	/**
	 * 10～20までカウントし出力する。
	 * @param numCount 数字
	 */
	public static void countNum() {
		int numCount;
		for (numCount = 10; numCount <= 20; numCount++) {
			System.out.println(numCount);

		}

	}

	//whileバージョン
	public static void whileCountNum() {
		int whileNumCount;
		whileNumCount = 10;
		while (whileNumCount <= 20) {
			System.out.println(whileNumCount);
			whileNumCount++;

		}
	}
}
