package program8;

public class prm5_06 {

	public static void main(String[] args) {
		program5_06();

	}

	public static void program5_06() {
		String str1 = "apple";
		String str2 = "orange";
		int num = 10;
		double dnum = 10.84;

		String result1 = concat(str1, str2);
		String result2 = concat(str1, num);
		String result3 = concat(str1, dnum);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

	public static String concat(String str1, String str2) {
		String str = str1.concat(str2);
		return str;
	}

	public static String concat(String str1, int num) {
		String str = str1 + num;
		return str;
	}

	public static String concat(String str1, double dnum) {
		String str = str1 + String.valueOf(dnum);
		return str;
	}
}
