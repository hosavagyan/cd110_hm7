import uttils.*;
import uttils.Math;
import Animals.*;
public class Driver {

	public static void main(String[] args) {
		Puppy name = new Puppy("Joey");
		Puppy name1 = new Puppy("Chandler");
		Puppy name2 = new Puppy("Ross");
		
		int[] num = {9, 20, 3, 44, 88, 300};
		ArrayUtils.reverse(num);
		ArrayUtils.stringifyArray(num);
		
		double number = 15.4;
		System.out.println(Math.fact((int) number));
	}
	
}