package purogram6;

public class prm3_19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_19();
	}

	public static void program3_19() {
		int[] arrayNum = { 1, 2, 4, 5, 7, 20, 17 };

		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println(arrayNum[i]);
			if (arrayNum[i] == 7) {
				break;
			}
		}
		System.out.println();
		whileVer(arrayNum);

	}

	public static void whileVer(int[] arrayNum) {

		int i = 0;
		while (i < arrayNum.length) {
			System.out.println(arrayNum[i]);
			if (arrayNum[i] == 7) {
				break;
			}
			i++;
		}
	}
}
