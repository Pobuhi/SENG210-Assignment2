import java.util.Scanner;

public class BMICalcPractice {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double height, weight, BMI = 0;
		boolean userChoice = false;
		int measurement = 0;
		
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

		switch (measurement) {

			case 1:

				System.out.println("How tall are you in meters?");
				height = Double.parseDouble(scnr.next());
		
				System.out.println("How much do you weigh in kg?");
				weight = Double.parseDouble(scnr.next());
		
				BMI = weight / (height * height);
				break;
			
			case 2:

				System.out.println("How tall are you in inches?");
				height = Double.parseDouble(scnr.next());

				System.out.println("How much do you weigh in pounds?");
				weight = Double.parseDouble(scnr.next());

				BMI = (weight * 703) / (height * height);
				break;
			
			default:

				break;

		}
		
		System.out.print("Your BMI is " + BMI);

		scnr.close();
	}
}
