//bmi_Tanushri

package bmi;	
import java.util.Scanner;

class Input {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    float height, weight;
    int maxAttempts = 3;

    public void getName() {
        System.out.print("\nEnter your name: ");
        name = sc.nextLine();
    }

    public void getAge() {
        int attempts = 0;
        while (attempts < maxAttempts) {
            try {
                System.out.print("\nEnter your age: ");
                age = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input for age. Please enter a valid integer value.");
                sc.nextLine();
                attempts++;
            }
        }
        if (attempts >= maxAttempts) {
            System.out.println("Maximum attempts reached. Exitting Program. Thank you for choosing NutriTrack.");
            System.exit(0);
        }
    }

    public void getHeightWeight() {
        int attempts = 0;
        while (attempts < maxAttempts) {
            try {
                System.out.print("\nEnter your height in cm: ");
                height = sc.nextFloat();
                System.out.print("\nEnter your weight in kg: ");
                weight = sc.nextFloat();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input for height or weight. Please enter valid numeric values. ");
                sc.nextLine();
                attempts++;
            }
        }
        if (attempts >= maxAttempts) {
            System.out.println("Maximum attempts reached. Exitting Program. Thank you for choosing NutriTrack.");
            System.exit(0);
        }
    }
}

class BMI extends Input {
	public double calculateBMI() {
        double heightMeters = height / 100.0;
        return weight / (heightMeters * heightMeters);
    }

    public String getWeightStatus() {
        double userBMI = calculateBMI();
        if (userBMI < 18.5) {
            return "Underweight";
        } else if (userBMI>= 18.5 && userBMI <= 24.9) {
            return "Normal weight";
        } else {
            return "Overweight";
        }
    }

    public String getExpectedBMI() {
        double expectedBMI = 21.75; // Example expected BMI according to WHO guidelines
        return String.format("%.2f", expectedBMI);
    }

    public String getExpectedWeightRange() {
        double minWeight = 18.5 * (height / 100.0) * (height / 100.0);
        double maxWeight = 24.9 * (height / 100.0) * (height / 100.0);
        return String.format("%.2f to %.2f", minWeight, maxWeight);
    }
}

public class bmi_Tanushri extends Input {
    public static void main(String[] args) {
        try {
            BMI bmiTracker = new BMI();

            bmiTracker.getName();
            bmiTracker.getAge();
            bmiTracker.getHeightWeight();

            System.out.println("Calculating BMI...");
            double userBMI = bmiTracker.calculateBMI();
            System.out.format("Your BMI: " + "%.2f",userBMI);
            System.out.println();
            System.out.println("Weight Status: " + bmiTracker.getWeightStatus());

            System.out.println(bmiTracker.name + ", according to your height and age, your BMI must be near to " +
                    bmiTracker.getExpectedBMI() + " and weight must be between " + bmiTracker.getExpectedWeightRange());

            if (userBMI < 18.5) {
                System.out.println(bmiTracker.name + ", you are underweight.");
            } else if (userBMI>= 18.5 && userBMI <= 24.9) {
                System.out.println(bmiTracker.name + ", your weight is perfect, you just need to maintain.");
            } else {
                System.out.println(bmiTracker.name + ", you are overweight.");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid input. The Following error has occurred: " + e.getMessage()+" Please enter valid numeric values for age, height, and weight.");
        }
        
    }
}