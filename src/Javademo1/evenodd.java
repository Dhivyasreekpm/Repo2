package Javademo1;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number:");
int number= scanner.nextInt();

if(number %2 == 0) {
	System.out.println("Given number is even");
}
else {
	System.out.println("Given number is odd");
}

	}

}
