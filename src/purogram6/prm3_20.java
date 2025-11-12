package purogram6;

public class prm3_20 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_20();
	}

	public static void program3_20() {
		int[] arrayNum = { 1, 2, 4, 5, 7, 20, 17 };

		for (int i = 0; i < arrayNum.length; i++) {
			if (arrayNum[i] == 20) {
				i++;
			}
			System.out.println(arrayNum[i]);
		}
		System.out.println();
		programWhile(arrayNum);
	}

	public static void programWhile(int[] arrayNum) {
		int i = 0;
		while (i < arrayNum.length) {
			if (arrayNum[i] == 20) {
				i++;
			}
			System.out.println(arrayNum[i]);
			i++;
		}
	}
}
