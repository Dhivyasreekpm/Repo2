package Javademo1;

import java.lang.*;
import java.util.Scanner;

public class roughWork {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
    	//String str= "Test the product";
    	String str;  
    	System.out.println("Enter a string: ");  
    	Scanner scanner = new Scanner(System.in);  
    	str = scanner.nextLine();  
    	scanner.close();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {

            for(int j=arr[i].length()-1;j>=0;j--)
            {   
            System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }

    }
}