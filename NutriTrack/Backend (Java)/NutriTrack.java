//NutriTrack (Main Class)

import java.util.*;
import bmi.*;
import gender.*;

public class NutriTrack 
{
    public static void main(String[] args) 
    {
        bmi.bmi_Tanushri T = new bmi.bmi_Tanushri();
        gender.male_Joshi J = new gender.male_Joshi();
        gender.female_Revati R = new gender.female_Revati();
        gender.other_Deshpande D = new gender.other_Deshpande();
        
        T.main(args);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice for the diet plan: ");
        System.out.println(" 1. Male \n 2. Female \n 3. Other");
        
        int chances = 3;
        boolean validInput = false;
        
        while (chances > 0) {
            try {
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        J.main(args);
                        validInput = true;
                        break;
                    case 2:
                        R.main(args);
                        validInput = true;
                        break;
                    case 3:
                        D.main(args);
                        validInput = true;
                        break;
                    default:
                        throw new InputMismatchException("Invalid input. Please try again.");
                }
                if (validInput) 
                {
                    break; // Exit the loop if input is valid
                }
                else
                {
                	chances--;
                	System.out.println("Invlid Input. You have " + chances + " chances left. Please try again");
                	sc.nextLine();
                }
                
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("An exception occurred: " + e.getMessage());
                chances--;
                System.out.println("You have " + chances + " chances left. Please try again");
                sc.nextLine();
            }
            finally
            {
                
                if (chances == 0) 
                {
                    System.out.println("Exceeded maximum attempts. Exiting program. Thank you for choosing NutriTrack");
                    sc.close();
                    System.exit(1);
                }
                	 
            }
        }
    }
}