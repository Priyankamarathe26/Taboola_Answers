import java.util.Scanner;

public class Problem2 {
	public static void checkIntPresent(String inputString) {
		
		boolean charPresent = false;
		int i;
		for(i=0;i<inputString.length();i++) {
			if(Character.isDigit(inputString.charAt(i))){
				charPresent=true;
				break;
			}
		}
		if(charPresent==true) {
			System.out.println("Integer is Present");
		}
		else {
			System.out.println("Integer is not Present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the string you want to verify");
			//Taking input from keyboard using Scanner
			String inputString= scanner.nextLine();  
			
			//check if string is empty
			if(inputString==null || inputString.length()==0) {
				throw new RuntimeException("String cannot be empty");
			}
			
			checkIntPresent(inputString);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	}


