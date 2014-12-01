
public class Reverse {
	
	/**
	 * Reverses the input string
	 * @param input the string we want to reverse
	 * @return the reversed string
	 */
	public static String reverse(String input){
		String reversed = "";
		char[] inputAsChar = input.toCharArray();
		
		for(int i = inputAsChar.length - 1; i > -1; i-- ){
			reversed += inputAsChar[i];
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		
		System.out.println("Unesi string");
		String unos = TextIO.getln();
		String reversed = reverse(unos);
		
		System.out.println(unos +" " + reversed);

	}

}
