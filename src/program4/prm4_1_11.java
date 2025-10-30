package program4;

import java.util.Arrays;

public class prm4_1_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program1_11();
	}
	public static void program1_11() {
		int num = 12;
		String name = "Hello";
		boolean flag = true;
		char c = 'A';
		int[] nums = {1,2,3,4,5};
		
		
		System.out.println(num+"\n" + name +"\n"+ flag +"\n"+ c +"\n"+ Arrays.toString(nums));
		
		for (int n : nums) {
		    System.out.println(n);
		}
	}
}
