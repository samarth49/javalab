//8.	Implement a Java program to perform basic operations on arrays. The program should support the following operations:
//A.	Initialize an array with given elements.
//B.	Find the sum of all elements in the array.
//C.	Find the maximum element in the array.
//D.	Find the minimum element in the array.
//E.	Sort the elements of the array in ascending order.
//F.	Reverse the elements of the array.

package Lab;
import java.util.*;

public class ArrayO {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,4,6,7};
		int sum =0;
		for(int i=0;i<arr.length-1 ; i++) {
			sum += arr[i];
		}
		sortt(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Maximum number is : "+ arr[arr.length-1]);
		System.out.println("minimum number is : "+ arr[0]);
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}
	
	public static void sortt(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void reverse(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(j>i) {
			int temp=arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
