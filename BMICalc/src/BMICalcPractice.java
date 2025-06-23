import java.util.Scanner;

public class BMICalcPractice {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double height, weight, BMI = 0;
		String userInput;
		boolean userChoice = false;
		String userName;
		int measurement = 0;
		
		System.out.println("Hi, I'm going to help you find out your BMI!");

		System.out.println("What is your name?");
		userName = scnr.next();

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

		switch (measurement) {

			case 1:

				System.out.println("\nHow tall are you in meters?");
				userInput = scnr.next();
				height = Double.parseDouble(userInput);
		
				System.out.println("\nHow much do you weigh in kg?");
				userInput = scnr.next();
				weight = Double.parseDouble(userInput);
		
				BMI = weight / (height * height);
				break;
			
			case 2:

				System.out.println("\nHow tall are you in inches?");
				height = Double.parseDouble(scnr.next());

				System.out.println("\nHow much do you weigh in pounds?");
				weight = Double.parseDouble(scnr.next());

				BMI = (weight * 703) / (height * height);
				break;
			
			default:

				break;

		}
		
		System.out.println("\nWell, " + userName);
		System.out.printf("Your BMI is %.2f%n", BMI);
		System.out.println("Thank you for using my BMI calculator!");

		scnr.close();
	}
}
