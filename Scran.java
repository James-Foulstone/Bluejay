import java.util.Scanner;  // Import the Scanner class

class Scran {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter the value you want to store:");  // Output text
    int userInput = scan.nextInt();  // Read user input and store in a variable
    System.out.println("Your value is: " + userInput);  // Output user input
    if(userInput >= 70) {
        System.out.println("Distiction");
    }
    else if(userInput >= 60 && userInput <= 69) {
        System.out.println ("Merit");
    }
    else if(userInput >= 40 && userInput <= 59) {
        System.out.println("Pass");
    }
    else if(userInput >= 0 && userInput <= 39) {
        System.out.println("Failed");
    }
}
}