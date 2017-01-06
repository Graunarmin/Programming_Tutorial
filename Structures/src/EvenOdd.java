import java.util.Scanner;

//loops

public class EvenOdd {
	
	//public int oddNumbers(int scan){
	//	int number = scan.nextInt();
	//	for (int i = 0; i <= number; i++){
	//		if (number % 2 != 0){
		//		return i;
			//}
		//}
	//}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		for (int i = 0; i <= number; i++){
			if (i % 2 != 0){
				System.out.println(i);
			}
	
		}
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
	
	}
}
