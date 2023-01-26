import java.util.Scanner;
public class Treadmill_Burned_Calories_Calculator {

	//It is a Program to calculating the burning calories during different activity.
	//A treadmill workout machine provides the following activities: running, walking, and mountain climbers. 
	//The machine uses metabolic equivalents (MET) to measure the amount of energy that is expended during exercise.
	
public static void main(String[] args) {
    
	
	//Welcome Banner
      System.out.println("Welcome to Calories burned calculator");
      System.out.println("-------------------------------------------------------------------"); 

        Scanner scan = new Scanner (System.in);


     // Prompt user
        System.out.println("Please enter your weight in pounds:");
        double Weight = scan.nextDouble();
        double WeightKG = Weight / 2.2;
        
        System.out.print("Running time(minutes):");
        double Running = scan.nextDouble();
        
        System.out.print("Walking time(minutes):");
        double Walking = scan.nextDouble();
        
        System.out.print("Mountain Climbers time(minutes):");
        double MountainCliming = scan.nextDouble();
        
        System.out.println("");
        
        //Variable declaration
        double RunningMET = 10;
        double WalkingMET = 4;
        double MountainClimingMTE = 8;
        double Multiplier = 0.0175;
        
        //Formula declaration for calculations
        double energyExpenditrueRunning = Multiplier * WeightKG * RunningMET * Running;
        double energyExpenditrueWalking = Multiplier * WeightKG * WalkingMET * Walking;
        double energyExpenditrueCliming = Multiplier * WeightKG * MountainClimingMTE * MountainCliming; 
        
        //Output of program
        System.out.println("You burned an estimated " + energyExpenditrueRunning +" Calories Running,");
        System.out.println("burned an estimated " + energyExpenditrueWalking + " Calories Walking,");
        System.out.println("burned an estimated " + energyExpenditrueCliming + "Mountain Climing.");
        
        System.out.println("");
        
        double TotalCalories = energyExpenditrueRunning + energyExpenditrueWalking + energyExpenditrueCliming;
        System.out.println("Total calories burned = " + TotalCalories +"");
        
      //Closing Massage
        System.out.println("");
        System.out.println("Keep up your hard work. Your progress is amazing!");
        System.out.println("Thank you for using Calories burned calculator.");
        System.out.println("See you soon...");
   }

}
