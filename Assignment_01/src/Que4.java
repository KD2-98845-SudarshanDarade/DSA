import java.util.Scanner;

public class Que4 {
	
	public static int binarySearch(int arr[] , int key , int left , int right) {		
		
		while(left <= right) {
			int mid = (right + left) / 2;
			
			if(arr[mid] == key) {
				return mid;
			}
			if(key < arr[mid]) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter key to search : ");
		int key = sc.nextInt();
		int arr[] = { 9 , 8 , 7, 5, 4, 3, 2 , 0};
		int left = 0;
		int right = arr.length - 1;
		int idx = binarySearch(arr , key , left , right);
		if(idx != -1) {
			System.out.println("Key found at index : " + idx);
		}else {
			System.out.println("Key not found");
		}
		sc.close();
	}
}
