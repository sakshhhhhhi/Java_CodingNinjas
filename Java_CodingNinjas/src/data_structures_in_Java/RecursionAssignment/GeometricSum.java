package data_structures_in_Java.RecursionAssignment;

public class GeometricSum {
	public static double findGeometricSum(int k){
		if(k==0) {
			return 1;
		}
		double smallAns =findGeometricSum(k-1);
		return smallAns+(1/Math.pow(2, k));
		
	}

	public static void main(String[] args) {
		System.out.println(findGeometricSum(3));

	}

}
