package samuel;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] arg){
//create a sentence that asks a user for a season of a year
        Scanner scanner = new Scanner(System.in);
        System.out.print("what season of the year is this? ");
        String season = scanner.nextLine();
//        then a whole number
        System.out.print("input a whole number here  ");
        int wholeNumber = scanner.nextInt();
//        then an adjective
        System.out.print("an adjective is needed here please ");
        String adjective = scanner.next();
//        Display the result
        System.out.println("on a "+adjective  +  season +" day, i drink a minimium of "+wholeNumber+"cups of coffee");
    }
}
