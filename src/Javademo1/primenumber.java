package Javademo1;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number= scanner.nextInt();
		if(isprime(number)) {
			System.out.println("Given number is primeno");
		}
		else {
			System.out.println("Given number is not primeno");
		}
	}
		public static boolean isprime(int num) {
			for (int i=2;i<=num/2;i++) {
				if(num%i == 0) {
					return false;
				}
				else
				{
					return true;
				}
			
		}
			return false;
		}
}

	


