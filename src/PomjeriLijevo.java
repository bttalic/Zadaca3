
public class PomjeriLijevo {
	
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
		
		int[] array = {2, 34, 48, 24, 42, 78};
		printArray(array);
		array = pomjeriLijevo(array);
		printArray(array);

	}

}
