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
        int num1;
        int num2;
        System.out.println("Enter number 1 :");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2 :");
        num2 = scanner.nextInt();

        //? Send the final choice and numbers to calculator class to calculate
        //? and display the result
        System.out.println("Result : ");
        System.out.println(Calculate.Calculating(finalChoice, num1, num2));



    }
}