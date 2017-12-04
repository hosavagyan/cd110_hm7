package uttils;

public class Math {
	public static int fact(int num) {
		if(num == 0 )
			return 1;
		return num * fact(num-1);
	}
	public static long factorialLoop(int a) {
		int res = 1;
		for(int i = a; i > 0; i-- ) {
			res *= i;
		}
		return res;
	}
}