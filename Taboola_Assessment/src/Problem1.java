import java.util.Scanner;

public class Problem1 {
	public static int convertStringToInt(String inputString) {
		
		
		int i = 0;
		int number = 0;
		boolean isNegative = false;
		int len = inputString.length();
		
		//Check if number is negative then make isNegative flag true
		if (inputString.charAt(0) == '-') {
			isNegative = true;
			i = 1;
		}
                // Here you may use for loop as well
		while (i < len) {
			number = number*10;
			number +=(inputString.charAt(i++)-'0');
		}
		//if number is negative again prefix with negative sign
		if (isNegative){
			number = -number;
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter the string you want to convert to int:");
			
			//Taking input from keyboard using Scanner
			String inputString= scanner.nextLine();  
			
			//check if string is empty
			if(inputString==null || inputString.length()==0) {
				throw new RuntimeException("String cannot be empty");
			}
			
			System.out.println("----------------------------------------------");
			System.out.println("String Before Conversion in int:" + inputString);
			int intOutput = convertStringToInt(inputString);
			System.out.println("String After Conversion in int:" + intOutput);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
