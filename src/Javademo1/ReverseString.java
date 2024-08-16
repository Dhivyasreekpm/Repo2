package Javademo1;


import java.lang.*;
import java.io.*;
import java.util.*;
 
// Class of ReverseString
class ReverseString {
    public static void main(String[] args)
    {
    	String str;  
    	System.out.println("Enter a string: ");  
    	Scanner scanner = new Scanner(System.in);  
    	str = scanner.nextLine();  
    	scanner.close();
        char[] hello = str.toCharArray();
        List<Character> trial1 = new ArrayList<>();
 
        for (char c : hello)
            trial1.add(c);
 
        Collections.reverse(trial1);
        ListIterator li = trial1.listIterator();
        while (li.hasNext())
            System.out.print(li.next());
    }
}