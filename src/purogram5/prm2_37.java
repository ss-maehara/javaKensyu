package purogram5;

import java.util.Scanner;

public class prm2_37 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_37();
	}

	public static void program2_37() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力A :");

		int inputMonthNumA = scanner.nextInt();
		System.out.print("入力B :");
		int inputDayNumB = scanner.nextInt();

		switch (inputMonthNumA) {

		}

		//正座、日付判定
		String seiza = "";
		String startDay = "";
		String endDay = "";

		if ((inputMonthNumA == 3 && inputDayNumB >= 21) || (inputMonthNumA == 4 && inputDayNumB <= 19)) {
			seiza = "牡羊座（アリエス）";
		} else if ((inputMonthNumA == 4 && inputDayNumB >= 20) || (inputMonthNumA == 5 && inputDayNumB <= 20)) {
			seiza = "牡牛座（タウルス）";
		} else if ((inputMonthNumA == 5 && inputDayNumB >= 21) || (inputMonthNumA == 6 && inputDayNumB <= 21)) {
			seiza = "双子座（ゲミニ）";
		} else if ((inputMonthNumA == 6 && inputDayNumB >= 22) || (inputMonthNumA == 7 && inputDayNumB <= 22)) {
			seiza = "蟹座（カンケル）";
		} else if ((inputMonthNumA == 7 && inputDayNumB >= 23) || (inputMonthNumA == 8 && inputDayNumB <= 22)) {
			seiza = "獅子座（レオ）";
		} else if ((inputMonthNumA == 8 && inputDayNumB >= 23) || (inputMonthNumA == 9 && inputDayNumB <= 22)) {
			seiza = "乙女座（ヴィルゴ）";
		} else if ((inputMonthNumA == 9 && inputDayNumB >= 23) || (inputMonthNumA == 10 && inputDayNumB <= 23)) {
			seiza = "天秤座（リブラ）";
		} else if ((inputMonthNumA == 10 && inputDayNumB >= 24) || (inputMonthNumA == 11 && inputDayNumB <= 22)) {
			seiza = "蠍座（スコルピウス）";
		} else if ((inputMonthNumA == 11 && inputDayNumB >= 23) || (inputMonthNumA == 12 && inputDayNumB <= 21)) {
			seiza = "射手座（サギッタリウス）";
		} else if ((inputMonthNumA == 12 && inputDayNumB >= 22) || (inputMonthNumA == 1 && inputDayNumB <= 19)) {
			seiza = "山羊座（カプリコルヌス）";
		} else if ((inputMonthNumA == 1 && inputDayNumB >= 20) || (inputMonthNumA == 2 && inputDayNumB <= 18)) {
			seiza = "水瓶座（アクアリウス）";
		} else if ((inputMonthNumA == 2 && inputDayNumB >= 19) || (inputMonthNumA == 3 && inputDayNumB <= 20)) {
			seiza = "魚座（ピスケス）";
		}
		System.out.print(seiza);
	}
}
