
public class AddingBinary {
	
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
	
	/**
	 * adds the two array representations of the binary number
	 * @param binaryNum 
	 * @param binaryNum2
	 * @return array with the result
	 */
	public static int[] addBinary(int[] binaryNum, int[] binaryNum2){
		
		int carry = 0;
		int[] result = new int[8];
		for(int i = binaryNum.length - 1; i >= 0; i--){
			result[i] = binaryNum[i] + binaryNum2[i] + carry;
			
			if( result[i] > 1 ){
				carry = result[i] - 1;
				if( result[i] % 2 == 0){
					result[i] = 0;
				} else {
					result[i] = 1;
				}
			} else if (carry != 0){
				carry = 0;
			}
			
		}
		
		if( carry > 0){
			System.out.println("Result is more than 8 bits long");
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println("Unesi broj: ");
		int num = TextIO.getlnInt();
		
		System.out.println("Unesi drugi broj: ");
		int num2 = TextIO.getlnInt();
		
		int[] binaryNum = toBinaryArray(num);
		int[] binaryNum2 = toBinaryArray(num2);
		printArray(binaryNum);
		System.out.println("+");
		printArray(binaryNum2);
		System.out.println("=");
		int[] result = addBinary(binaryNum, binaryNum2);
		printArray(result);

	}

}
