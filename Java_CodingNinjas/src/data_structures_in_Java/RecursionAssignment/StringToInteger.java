package data_structures_in_Java.RecursionAssignment;

public class StringToInteger {
	public static int convertStringToInt(String input) {
		if(input.length()==1) {
			return Integer.parseInt(input);
		}
		char[]arr = input.toCharArray();
		char [] arr1 = new char[arr.length-1];
		for(int i =0;i<arr.length-1;i++) {
			arr1[i]=arr[i];
		}
		String smaller = new String(arr1);
		int number=convertStringToInt(smaller);
		int number2= Integer.parseInt(Character.toString((input.toCharArray()[input.length() - 1])));
		int number3 = number * 10 + number2;
		return number3;
	}

	public static void main(String[] args) {
		System.out.println(convertStringToInt("300"));

	}

}
