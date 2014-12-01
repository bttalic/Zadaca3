
public class IntToBinaryArray {
	
	
	/**
	 * Turns a number into a array of binary numbers
	 * @param num
	 * @return array representation
	 */
	public static int[] toBinaryArray(int num){
		
		int[] binary = new int[8];
		int index = 7;
		
		while(num != 0){
			binary[index] = num % 2;
			num /= 2;
			index--;
		}
		
		return binary;
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
		
		System.out.println("Unesi broj: ");
		int num = TextIO.getlnInt();
		
		int[] binary = toBinaryArray(num);
		printArray(binary);

	}

}
