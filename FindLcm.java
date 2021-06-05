package source.code;

public class FindLcm {
	public static void main(String[] args) {
		int x =  60, y = 120, lcm;
		lcm = (x > y) ? x : y;
		while (true) {
			if( lcm % x == 0 && lcm % y == 0) {
				System.out.printf("The LCM of %d and %d is %d:", x, y, lcm);
				break;
			}
			++lcm;	
		}
	}
}
