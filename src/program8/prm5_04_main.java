package program8;

public class prm5_04_main {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3;
		double dnum1 = 0.1, dnum2 = 0.2, dnum3 = 0.3;

		prm5_04 p04 = new prm5_04();
		int a = p04.max(num1, num2);
		int b = p04.max(num1, num2, num3);
		double c = p04.max(dnum1, dnum2, dnum3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
