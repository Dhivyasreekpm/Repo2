package Javademo1;

public class removecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc ABC 123 abc";
		//String strNew = str.replaceAll("([a-z])", "");
		//String strNew = str.replace(" ", "");
		//String strNew = str.substring(0, str.length()-1);
		//String strNew = str.replaceFirst("ab", "");
		String strNew = str.substring(2,str.length()-1);
		System.out.println(strNew);
	}

}
