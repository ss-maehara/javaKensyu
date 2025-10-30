package purogram5;

public class prm2_25 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_25();
	}

	public static void program2_25() {
		int numA = 10;
		int numB = 2;
		int sum;
		boolean isAdd = true;
		String operator = "あ";

		//足し算の処理
		if (operator.equals("足し算")) {
			sum = numA + numB;
		} else {
			sum = numA - numB;
		}
		if (operator.equals("引き算")) {
			sum = numA - numB;
		} else {
			sum = numA - numB;
		}

		if (isAdd) {
			sum = sum + 1;
		} else {
			sum = sum - 1;
		}
		if (!operator.equals("足し算") && !operator.equals("引き算")) {
			System.out.println("エラー。処理を終了します。");
		}

	}
}
