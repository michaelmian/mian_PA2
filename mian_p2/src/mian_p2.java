import java.util.Scanner;

public class mian_p2 {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int userChoice;
		double weightPounds;
		double weightKilos;
		double heightInches;
		double heightMeters;
		double bmi;
		
		System.out.println("Welcome to the BMI Calculator.");
		System.out.println("Please enter 1 for Imperial units or 2 for SI units.");
		userChoice = scnr.nextInt();
		
		if(userChoice == 1) {
			
			System.out.println("Please enter weight in lbs: ");
			weightPounds = scnr.nextDouble();
			
			System.out.println("Please enter height in inches: ");
			heightInches = scnr.nextDouble();
			
			bmi = (703 * weightPounds) / Math.pow(heightInches, 2);
			
			System.out.printf("Your BMI is %.1f ", bmi);
			
			System.out.println("\nThe BMI categories are as follows:");
			System.out.println("Underweight = < 18.5");
			System.out.println("Normal weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
		}
		else if (userChoice == 2) {
			
			System.out.println("Please enter weight in kgs: ");
			weightKilos = scnr.nextDouble();
			
			System.out.println("Please enter height in meters: ");
			heightMeters = scnr.nextDouble();
			
			bmi = weightKilos / Math.pow(heightMeters, 2);
			
			System.out.printf("Your BMI is %.1f", bmi);
			
			System.out.println("\nThe BMI categories are as follows:");
			System.out.println("Underweight = < 18.5");
			System.out.println("Normal weight = 18.5-24.9");
			System.out.println("Overweight = 25-29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
			
		}
		else {
			System.out.println("User input, " + userChoice + ", not recognized. Please try again.");
		}
		
	}

}
