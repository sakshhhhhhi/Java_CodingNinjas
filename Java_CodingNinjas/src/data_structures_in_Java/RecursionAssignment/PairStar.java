package data_structures_in_Java.RecursionAssignment;

public class PairStar {
	public static String addStars(String s) {
		//cheack for length 1
		if(s.length()==1) {
			return s;
		}
		// convert string s to character array
		char arr1[]=s.toCharArray();
		//smaller character array of arr1 
		char arr2[]= new char[arr1.length-1];
		for(int i =0;i<arr1.length-1;i++) {
			arr2[i]=arr1[i];
		}

		//converting smaller character aaray to string
		String temp = new String(arr2);
//		System.out.println(temp);
		String actual = addStars(temp);
//		System.out.println(actual);
		String s3= Character.toString(arr1[arr1.length-1]);
		System.out.println(s3);
		if(actual.charAt(actual.length()-1)==arr1[arr1.length-1]) {
			return actual+"*"+s3;
		}
		return actual+s3;
	}

	public static void main(String[] args) {
		System.out.println(addStars("hello"));

	}

}
