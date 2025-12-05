package program8;

public class prm5_02_main {

	public static void main(String[] args) {
		int input = 1;
		prm5_02 p02 = new prm5_02();
		String result = p02.InputNumberToString(input);
		int wordCount = p02.GetNumberOfCharacters(result);
		System.out.println(wordCount);
	}

}
