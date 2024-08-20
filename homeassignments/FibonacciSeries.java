package week1.homeassignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		int z=0;
		int range = 8;
		System.out.print("The Fibonacci Series are ");
	
		for (int i = 1; i <= range; i++) {
		if(i<range) {	
		System.out.print(x+", ");
		}else {
			
			System.out.print("and "+x+".");
		}
		z=x+y;
		x=y;
		y=z;
			
		}
	}
	
	}

