//ArrayIntersection
package Lab;
import java.util.*;

public class ArrayIntersection {
	public static void intersection(ArrayList<Integer> ans,int[] arr1,int[] arr2) {
		int i=0;
		int j=0;
		if(arr1.length==0) {
			return;
		}
		
		while(arr1.length-1 > i && arr2.length-1 > j) {
			if(arr1[i] != arr2[j]) {
				i++;
			}
			if(arr1[i] == arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			}
		}
		System.out.println(ans.toString());
	}

	public static void main(String[] args) {
		int arr1[] =  {9,4,9,8,4};
		int[] arr2 = {4,9,5};
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
		ArrayList<Integer> ans = new ArrayList<>();
		System.out.printf("Intersection Array: ");
		intersection(ans,arr1,arr2);
		
	}

}
