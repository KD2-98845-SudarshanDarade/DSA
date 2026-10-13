import java.util.HashMap;

public class Que8 {
	
	    public int firstNonRepeating(int[] arr) {
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        // Count frequencies of each element
	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }
	        
	        // Find the first element with a frequency of 1 in original order
	        for (int num : arr) {
	            if (map.get(num) == 1) {
	                return num;
	            }
	        }
	        
	        // Return 0 or -1 if no non-repeating element is found
	        return 0; 
	    }
}
