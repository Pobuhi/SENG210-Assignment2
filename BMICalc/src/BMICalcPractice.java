import java.util.Scanner;

public class BMICalcPractice {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double height, weight, BMI;
		String userInput, userResponse;
		
		System.out.println("Hi, I'm going to help you find out your BMI!");
		
		System.out.println("How tall are you in meters?");
		userInput = scnr.next();
		height = Double.parseDouble(userInput);
		
		System.out.println("How much do you weigh in kg?");
		userResponse = scnr.next();
		weight = Double.parseDouble(userResponse);
		
		BMI = weight / (height * height);
		
		System.out.print("Your BMI is " + BMI);
	}
}
