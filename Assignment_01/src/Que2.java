import java.util.Scanner;

public class Que2 {
	
	public static int findElement(int arr[] , int key) {
		for(int i = arr.length - 1 ; i>= 0 ; i--) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int arr[] = { 1 ,3 ,4 ,5 , 3, 2 , 4};
		System.out.println("Enter key want to search :");
		int target = scanner.nextInt();
		int index = findElement(arr ,target);
		if(index != -1) {
			System.out.println("Key present at index : " + index);
		}else {
			System.out.println("Key not found");
		}
		scanner.close();
	}
}
