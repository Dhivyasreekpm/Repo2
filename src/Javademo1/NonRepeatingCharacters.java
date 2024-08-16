package Javademo1;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacters {

	public static void printNonRepeatingChars(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Non-repeating characters in the string \"" + input + "\":");
        printNonRepeatingChars(input);
    }
}
