package samuel;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args){
        try{
        String[] day = {"monday","tuesday","wednessday","thursday","friday","saturda","sunday"};
        System.out.println("enter the corresponding number of the day of the week: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextByte();
        System.out.println("today is "+day[input-1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid day of the week");
        }
    }

}
