
public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Rama");
		String str2 = str1;
		String str3 = new String("Rama");
		
			System.out.println(" str1 == str2 :" + (str1== str2));
			System.out.println(" str1 == str2 :" + (str1== str3));
			System.out.println(" str3.equals(str1) :"+ str3.equals(str1));
	
	}

}
