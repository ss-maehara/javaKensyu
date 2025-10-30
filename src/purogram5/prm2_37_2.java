package purogram5;

import java.util.Scanner;

public class prm2_37_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_37_2();
	}

	public static void program2_37_2() {
		//星座配列
		String[] seiza = { "牡羊座", "牡牛座", "双子座", "蟹座", "獅子座", "乙女座", "天秤座", "蠍座", "射手座", "山羊座", "水瓶座", "魚座" };
		//ラテン語星座配列
		String[] raten = { "アリエス", "タウルス", "ゲミル", "カンケル", "レオ", "ウィルゴ", "リブラ", "スコルピウス", "サギッタリウス", "カプリコルヌス", "アクアリウス",
				"ピスケス" };

		Scanner scanner = new Scanner(System.in);
		//誕生日の月入力
		System.out.print("入力A :");
		int inputMonthNumA = scanner.nextInt();
		//誕生日の日入力
		System.out.print("入力B :");
		int inputDayNumB = scanner.nextInt();

		//月で季節を判定する。
		String season = sstringSason(inputMonthNumA);
		//星座の配列番号
		int seizaNum;
		//誕生日で星座を判定する。
		seizaNum = determineYourHoroscopeByDate(inputMonthNumA, inputDayNumB);

		System.out.println("季節:" + season);
		System.out.println("星座:" + seiza[seizaNum] + raten[seizaNum]);

	}

	/**
	 * 誕生日で星座を判定する。
	 * @param intMonth 月
	 * @param intDay 日
	 * @return 星座の配列番号
	 */
	public static int determineYourHoroscopeByDate(int intMonth, int intDay) {
		//星座の配列番号
		int seizaNum = 0;
		//誕生日で星座を判定する。
		if ((intMonth == 3 && intDay >= 21) || (intMonth == 4 && intDay <= 19)) {
			seizaNum = 0;
		} else if ((intMonth == 4 && intDay >= 20) || (intMonth == 5 && intDay <= 20)) {
			seizaNum = 1;
		} else if ((intMonth == 5 && intDay >= 21) || (intMonth == 6 && intDay <= 21)) {
			seizaNum = 2;
		} else if ((intMonth == 6 && intDay >= 22) || (intMonth == 7 && intDay <= 22)) {
			seizaNum = 3;
		} else if ((intMonth == 7 && intDay >= 23) || (intMonth == 8 && intDay <= 22)) {
			seizaNum = 4;
		} else if ((intMonth == 8 && intDay >= 23) || (intMonth == 9 && intDay <= 22)) {
			seizaNum = 5;
		} else if ((intMonth == 9 && intDay >= 23) || (intMonth == 10 && intDay <= 23)) {
			seizaNum = 6;
		} else if ((intMonth == 10 && intDay >= 24) || (intMonth == 11 && intDay <= 22)) {
			seizaNum = 7;
		} else if ((intMonth == 11 && intDay >= 23) || (intMonth == 12 && intDay <= 21)) {
			seizaNum = 8;
		} else if ((intMonth == 12 && intDay >= 22) || (intMonth == 1 && intDay <= 19)) {
			seizaNum = 9;
		} else if ((intMonth == 1 && intDay >= 20) || (intMonth == 2 && intDay <= 18)) {
			seizaNum = 10;
		} else if ((intMonth == 2 && intDay >= 19) || (intMonth == 3 && intDay <= 20)) {
			seizaNum = 11;
		}
		return seizaNum;
	}

	//戻り値の型
	public static String sstringSason(int intMOnth) {
		String season = "";
		//季節判定
		switch (intMOnth) {
		case 12:
		case 1:
		case 2:
			season = "冬";
			break;
		case 3:
		case 4:
		case 5:
			season = "春";
			break;
		case 6:
		case 7:
		case 8:
			season = "夏";
			break;
		case 9:
		case 10:
		case 11:
			season = "秋";
			break;

		}
		return season;

	}
}
