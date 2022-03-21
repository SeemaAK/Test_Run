public class StringReverse {
	public static void main(String[]args) {
		String name= new String("vamsi");
		String reverse = "";
		for (int i = name.length(); i > 0 ; i-- ) {
			reverse += name.charAt(i-1);
		}
		System.out.println("Reverse of the given String is: "+reverse);
	}
}
