
public class AllPalindromes {
	
	/**
	 * Splits the input string at the given character
	 * @param input the string we want to split
	 * @param separator the character at which the string should happen
	 * @return string array whoes elements are the parts of the splited string
	 */
	public static String[] split(String input, char separator ){
		
		String[] split = new String[input.length()];
		
		//ako ovo ne uradimo svi clanovi ce imati vrijednost null
		for(int i = 0; i < split.length; i++){
			split[i] = "";
		}
		
		int index = 0;
		char[] inputAsChar = input.toCharArray();
		
		for(int i = 0; i < inputAsChar.length; i++){
			if( inputAsChar[i] != separator ){
				split[index] += inputAsChar[i];
			} else if( split[index].equals("") == false ){
				while( inputAsChar[i] == separator && i < inputAsChar.length)
					i++;
				//posto smo otisli jedan index vise moramo smanjiti i
				i--;
				
				if( i < inputAsChar.length - 1)
				index++;
			}
		}
		
		//ovo je jedan od nacina da se promjeni velicina niza
		String[] temp = new String[index+1];
		for(int i = 0; i <= index; i++){
			temp[i] = split[i];
		}
		split = temp;
		return split;
	}
	
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
		
		String[] words = split(unos, ' ');
		
		for(int i = 0; i < words.length; i++){
			if( words[i].equalsIgnoreCase(reverse(words[i])) ){
				System.out.println(words[i]);
			}
		}

	}

}
