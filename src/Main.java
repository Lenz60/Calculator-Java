//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"Add","Substract", "Multiply", "Divide"};

        System.out.println("Calculator");
        System.out.println("Please choose an Operation");
        //? Display Choices
        for (int i = 0; i< choices.length; i++){
            System.out.println((i+1) + ". " + choices[i]);
        }

        //? Get inputted choices
        int choice = -1;
        while(choice <1 || choice > choices.length){
            System.out.println("Enter number of the operation");
            if(scanner.hasNextInt()){
                choice = scanner.nextInt();
                if(choice < 1 || choice > choices.length){
                    System.out.println("Invalid number of operation, try again");
                }
            }else {
                System.out.println("Invalid input. Please enter a number");
                scanner.next();
            }
        }
        //? Save final choices of operation to variable
        String finalChoice = choices[choice-1];

        //? Input a Number to proceed the calculation
        double num1;
        double num2;
        num1 = checkDouble(scanner, "Enter number 1 :");
        num2 = checkDouble(scanner, "Enter number 2 :");


        //? Send the final choice and numbers to calculator class to calculate
        //? and display the result
        System.out.println("Result : ");
        double Result = Calculate.Calculating(finalChoice,num1,num2);
        System.out.println(Result);
    }

    public static double checkDouble (Scanner scanner, String prompt){
        System.out.println(prompt);
        while(!scanner.hasNextDouble()){
            System.out.println("Invalid Input, Please input a number");
            scanner.next();
            System.out.println(prompt);
        }
        return scanner.nextDouble();
    }
}