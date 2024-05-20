//Generate a random array of integers with a specified size and range of values.
//Implement the following array manipulation operations as separate methods:
//a.	Rotate the elements of the array to the right by a specified number of position.
//b.	Remove duplicate elements from the array while preserving the original order.
//c.	Rearrange the elements of the array such that all even numbers appear before all odd numbers,
//preserving the relative order of even and odd numbers.

package Lab;
import java.util.*;

public class RandomArray {
	public static int[] generateArray(int size,int min,int max) {
		Random rand = new Random();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = rand.nextInt(max-min+1)+min;
		}
		return arr;
	}
	public static void rotate(int[] array,int places) {
		int length = array.length;
		places = places%length;
		//reverseArray(array,start,end);
		reverseArray(array,0,length-1);
		reverseArray(array,0,places-1);
		reverseArray(array,places,length-1);
	}
	public static void reverseArray(int[] array,int start,int end) {
		while(start<end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
			
		}
	}
	public static int[] removeDuplicates(int[] array) {
		Set<Integer> st = new HashSet<Integer>();
		List<Integer> list = new ArrayList<>();
		for(int i: array) {
			if(!st.contains(i)) {
				st.add(i);
				list.add(i);
			}
		}
		int[] ans = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
	public static void rearrange(int[] array) {
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		for(int i:array) {
			if(i%2==0) {
				even.add(i);
			}else {
				odd.add(i);
			}
		}
		int i=0;
		for(int c : even) {
			array[i++]=c;
		}
		for(int c: odd) {
			array[i++] = c;
		}
		System.out.println(Arrays.toString(array));
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of random array: ");
		int size = sc.nextInt();
		sc.nextLine();//consume new line
		System.out.println("Enter the min value: ");
		int min = sc.nextInt();
		System.out.println("Enter the max value: ");
		int max = sc.nextInt();
		
		int[] random_array = generateArray(size,min,max); 
		System.out.println("Array is: "+Arrays.toString(random_array));
		System.out.println("Enter rotate array with how many places: ");
		int rr = sc.nextInt();
		rotate(random_array,rr);
		System.out.println("After rotation: "+ Arrays.toString(random_array));
		int[] ans1=removeDuplicates(random_array);
		System.out.println("after remove duplicates: "+Arrays.toString(ans1));
		System.out.println("Rearrange even odd: ");
		rearrange(random_array);
		
		
		
		
	}

}
