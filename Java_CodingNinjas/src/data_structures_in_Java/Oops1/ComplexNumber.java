package data_structures_in_Java.Oops1;

import java.util.*;
public class ComplexNumber{
	int real;
	int imaginary;
	ComplexNumber(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void plus(ComplexNumber c2) {
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
	}
	public void print() {
		System.out.print(real+" + i"+imaginary);
	}
	public void multiply(ComplexNumber c2) {
		int r=this.real*c2.real-this.imaginary*c2.imaginary;
		this.imaginary=this.imaginary*c2.real+this.real*c2.imaginary;
		this.real=r;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
		ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

		int choice = s.nextInt();

		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}

	}


}
