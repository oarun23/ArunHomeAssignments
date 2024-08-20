package week1.homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		
		int n = 8;
		
		for (int i = 2; i < n-1; i++) {
			
			if(n%i==0) {
				System.out.println("Number is Non-Prime");
				break;
			}else {
				System.out.println("Number is Prime");
				break;
			}
			
		}

	}

}
