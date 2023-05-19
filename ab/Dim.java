package ab;

import java.util.Scanner;

public class Dim {
	public static void main(String[] args) {
		// Scanner
		Scanner sca = new Scanner(System.in);

		System.out.println("a");



		while (true) {

			int a = sca.nextInt();

			if (a > 5) {
				System.out.println("ac");
			} else if (a > 2) {
				System.out.println("s");
			} else {
				break;
			}
		}
	}
}
