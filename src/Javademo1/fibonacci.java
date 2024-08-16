package Javademo1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int number= scanner.nextInt();
		int first=0,second=1,next;
		System.out.println("fibonacci terms");
		for(int i=0;i<=number;i++) {
			System.out.println(first+"");
			next=first+second;
			first=second;
			second=next;
		}
	}

}
