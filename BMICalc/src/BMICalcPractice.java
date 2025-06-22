import java.util.Scanner;

public class BMICalcPractice {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double height, weight, BMI;
		String userInput, userResponse;
		boolean userChoice = false;
		int measurement;
		
		System.out.println("Hi, I'm going to help you find out your BMI!");

		System.out.println("First, are you using metric or US customary?");
		System.out.println("1. Metric");
		System.out.println("2. Us Customary");

		while (!userChoice) {

			measurement = scnr.nextInt();

			if (measurement == 1 || measurement == 2) userChoice = true;
			else {
				System.out.println("Sorry, that wasn't a valid response, please try again.");
				System.out.println("1. Metric");
				System.out.println("2. Us Customary");
			}

		}
		
		System.out.println("How tall are you in meters?");
		userInput = scnr.next();
		height = Double.parseDouble(userInput);
		
		System.out.println("How much do you weigh in kg?");
		userResponse = scnr.next();
		weight = Double.parseDouble(userResponse);
		
		BMI = weight / (height * height);
		
		System.out.print("Your BMI is " + BMI);

		scnr.close();
	}
}
