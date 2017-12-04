package uttils;

public class ArrayUtils {
	public static String reverse(int[] arr) {
		String result = "";
		for(int i = arr.length - 1; i >= 0; i--) {
			 result += arr[i] + " ";
		}
		return result;
	}
	public static String stringifyArray(int[] arr) {
	    String result = "";
	    for(int i = 0; i < arr.length; i++) {
	        if(i == arr.length - 1) {
	            result += arr[i];
	        } else {
	            result += arr[i] + ",";
	        }
	    }
	    return result;
	}
		
	}