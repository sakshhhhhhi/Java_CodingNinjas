package functionsAndScope;

public class FahrenheitToCelsiusTable {
	public static void printFahrenheitTable(int start,int end,int step) {
		int i,c;
		for(i=start;i<=end;i=i+step) {
			c=((i-32)*5)/9;
			System.out.println(i+"\t"+c);
		}
	}

	public static void main(String[] args) {
		printFahrenheitTable(0,100,20);

	}

}
