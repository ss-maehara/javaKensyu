package program8;

public class prm5_05_main {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3;
		double dnum1 = 0.1, dnum2 = 0.2, dnum3 = 0.3;

		prm5_05 p05 = new prm5_05();
		int a = p05.average(num1, num2);
		int b = p05.average(num1, num2, num3);
		double c = p05.average(dnum1, dnum2, dnum3);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
