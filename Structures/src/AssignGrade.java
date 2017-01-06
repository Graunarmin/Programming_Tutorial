import java.util.Scanner;

//if-else

public class AssignGrade {
	
	public static void printGrades(int score){
		if (grade(score) == 7.0){
			error();
		}
		else{
			System.out.println(grade(score));
		}
	}
	
	public static double grade(int score){
		if (score > 100){
			return 7.0;
		}
		else if (score >= 95){
			return 1.0;
		}
		else if (score >= 90){
			return 1.3;
		}
		else if (score >= 85){
			return 1.7;
		}
		else if (score >= 80){
			return 2.0;
		}
		else if (score >= 75){
			return 2.3;
		}
		else if (score >= 70){
			return 2.7;
		}
		else if (score >= 65){
			return 3.0;
		}
		else if (score >= 60){
			return 3.3;
		}
		else if (score >= 55){
			return 3.7;
		}
		else if (score >= 50){
			return 4.0;
		}
		else if (score >= 0){
			return 5.0;
		}
		else{
			return 7.0;
		}
	}
	
	public static void error(){
		System.out.println("Please enter a score between 100 and 0");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		//todo: when executing the program you will be ask to write a score.
		//The program converts the score then into a grade and prints that grade (1.0, 1.3, 1.7, ...)
		//Note that the student passed when the student gets a score of 50.0 points (4.0)
		
		
		
		AssignGrade.printGrades(score);		
		
	}
}

