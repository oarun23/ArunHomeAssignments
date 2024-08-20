package week1.homeassignments;

import java.util.Arrays;

public class FindMissingElement {

	
	
public static void main(String[] args) {
		
		int a[] = {1,4,3,2,8,6,7};

		
		System.out.println("Missing element on array is");
		Arrays.sort(a);
		if(a[0]== 1) {
		for (int i = 0; i < a.length-1; i++) {
						

			if(a[i+1]!=a[i]+1) {
				System.out.println(a[i]+1);
		break;
			}
				
	}
		}
		else
			System.out.println("1" );
	}
}




