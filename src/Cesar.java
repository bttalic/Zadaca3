
public class Cesar {

	public static String cesar(String input){
		
		String normal = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
		String cesar = "XYZABCDEFGHIJKLMNOPQRSTUVWxyzabcdefghijklmnopqrstuvw ";
		String secret = "";
		char[] inputAsChar = input.toCharArray();
		
		for(int i = 0; i < inputAsChar.length; i++){
			int index = normal.indexOf(inputAsChar[i]);
			secret += cesar.charAt(index);
		}
		return secret;
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Unesi string");
		String unos = TextIO.getln();
		System.out.println(unos);
		System.out.println(cesar(unos));
	}

}
