package ab;

import java.util.Scanner;

public class Aim {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		
		
		while (true) {
			
			int a = sca.nextInt();
		
			if (a > 10) {
			
				System.out.println("sa");
			
			} else if (a > 5) {
			
				System.out.println("sd");
			
			} else {
			
				break;
			
			}
			
		}
		
	}

}
