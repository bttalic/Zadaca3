
public class LastTenEntries {
	
	/**
	 * Moves array elements one place to the left
	 * @param array the array we want to edit
	 * @return the edited array
	 */
	public static int[] pomjeriLijevo(int[] array){
		
		for(int i = 0; i < array.length-1; i++){
			array[i] = array[i+1];
		}
		array[ array.length - 1 ] = 0;
		return array;
	}
	
	/**
	 * Prints out the elements of an array
	 * @param array the array you want to print
	 */
	public static void printArray(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		int[] entries = new int[10];
		int userInput = 0;
		int index = 0;
	
		do {
			System.out.println("Unesi broj: ");
			userInput = TextIO.getlnInt();
			
			if( userInput == -1)
				break;
			if( index > 9 ){
				entries = pomjeriLijevo(entries);
				index = 9;
			}
			entries[index] = userInput;
			index++;
		}while(userInput != -1);
		
		printArray(entries);

	}

}
