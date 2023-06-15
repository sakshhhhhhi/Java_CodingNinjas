package data_structures_in_Java.Recursion2;

public class QuickSort {
	
	public static int partition(int a[],int sIndex,int eIndex) {
		int pivotElement=a[sIndex];
		int smallerNumCount=0;
		for(int i =sIndex+1;i<=eIndex;i++) {
			if(a[i]<pivotElement) {
				smallerNumCount++;
			}
		}
		int temp =a[sIndex+smallerNumCount];
		a[sIndex+smallerNumCount]=pivotElement;
		a[sIndex]=temp;
		int i =sIndex;
		int j =eIndex;
		while(i<j) {
			if(a[i]<pivotElement) {
				i++;
			}
			else if(a[j]>=pivotElement) {
				j--;
			}
			else {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return sIndex+smallerNumCount;
	}
	
	public static void quickSort(int a[],int sIndex, int eIndex) {
		if(sIndex>=eIndex) {
			return;
		}
		int pivotIndex=partition(a,sIndex,eIndex);
		quickSort(a,sIndex,pivotIndex-1);
		quickSort(a,pivotIndex+1,eIndex);
	}

	public static void main(String[] args) {
		int[] a= {10,4,5,6,7,3,11,2};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
