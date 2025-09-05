package samuel;

import java.util.Scanner;

public class DolarCalc {
    public static void main(String[] arg){
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quentity of penny: ");

        double pennies = scanner.nextDouble();
        System.out.print("Enter the quantity of nickels: ");

        double nickels = scanner.nextDouble();
        System.out.print("Enter the quantity of dimes ");

        double dimes = scanner.nextDouble();
        System.out.print("Enter the quantity of quater ");

        double quaters = scanner.nextDouble();

        double pennyValue = pennies/100;

        double nickelValue = nickels/20;

        double dimesValue = dimes/10;

        double querterValue = quaters/4;


        double overAllValua =pennyValue+nickelValue+dimesValue+querterValue;

        if(overAllValua==dollar){
            System.out.println("congrat you have won!");
        }
        else if(overAllValua<dollar){
            double change = dollar-overAllValua;
            System.out.println("sorry you are below the score by "+change);
        }
        else{
            double change = overAllValua - dollar;
            System.out.println("sorry you exceeds the expected score by "+change);
        }
    }
}
