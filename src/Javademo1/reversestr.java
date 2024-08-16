package Javademo1;

public class reversestr {

	
    public static void main(String[] args) {
        String s = "Hello India";
        String[] ch = s.split(" ");
        for (String chr : ch) {
            String rev = "";
            for (int i = chr.length() - 1; i >= 0; i--) {
                rev = rev + chr.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}