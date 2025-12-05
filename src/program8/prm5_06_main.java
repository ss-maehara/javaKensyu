package program8;

public class prm5_06_main {

	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "orange";
		int num = 10;
		double dnum = 10.84;

		prm5_06 p06 = new prm5_06();
		String result1 = p06.concat(str1, str2);
		String result2 = p06.concat(str1, num);
		String result3 = p06.concat(str1, dnum);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
