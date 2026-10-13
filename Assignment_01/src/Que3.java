
import java.util.Scanner;
public class Que3 {
	
	public static int findTarget(int arr[] , int nth , int key) {
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(key == arr[i]) {
				nth--;
			}
			
			if(nth == 0) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = { 1, 2, 2, 1, 2 , 1 ,3 , 1,3};
		System.out.println("Enter nth number : ");
		int nth = scanner.nextInt();
		System.out.println("Enter key : ");
		int key = scanner.nextInt();
		int idx = findTarget(arr , nth , key);
		if(idx != -1 ) {
			System.out.println("Key is at idex : " + idx);
		}else {
			System.out.println("Key not found");
		}
		scanner.close();
	}
}
