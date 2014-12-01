
public class AllDivisibleByDigitSum {
	
	/**
	 * Calculates the sum of the digits of a given number
	 * @param num the number whos digits we want to sum
	 * @return the sum of the digits
	 */
	public static int digitSum(int num){
		
		int sum = 0;
		while(num > 0){
			sum += num%10;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Unesi broj: ");
		int num = TextIO.getlnInt();
		
		for(int i = 1; i <= num; i++){
		
			if(i % digitSum(i) == 0){
				System.out.print(i + " ");
			}
			
		}

	}

}
