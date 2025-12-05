package program8;

public class prm5_04 {

	public static void main(String[] args) {
		program5_4();

	}

	public static void program5_4() {
		int num1 = 1, num2 = 2, num3 = 3;
		double dnum1 = 0.1, dnum2 = 0.2, dnum3 = 0.3;

		int a = max(num1, num2);
		int b = max(num1, num2, num3);
		double c = max(dnum1, dnum2, dnum3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int max(int num1, int num2, int num3) {
		int max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		return max;
	}

	public static double max(double num1, double num2, double num3) {
		double max = num1;
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		return max;
	}

	public void test() {
		System.out.println("Hello");
	}
}
