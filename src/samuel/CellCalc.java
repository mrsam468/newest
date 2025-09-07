package samuel;

import java.util.Scanner;

public class CellCalc {
    static Scanner scanner = new Scanner(System.in);

    static double overageCharges = 0.25;


    public static void main(String[] args ){
        System.out.println("enter your preffered plan");
        double plan = scanner.nextDouble();

        double getoverage = getOverage();
        double overage = overage(getoverage);
        double tax = tax(plan)+tax(overage);
        double total = plan+overage+tax;

        System.out.println("phone bill statement");
        System.out.println("plan: "+plan);
        System.out.println("overage: "+overage);
        System.out.println("tax: "+tax);
        System.out.println("total: "+total);
    }

    public static double tax(double plan){

        return plan*0.15;
    }
    public static double getOverage(){
        System.out.println("how many minutes did you exceed you expected plan by?");
        return scanner.nextDouble();
    }
    public static double overage(double overage ){
if(overage>0){
    return overage*overageCharges;
}
else{
    return 0;
}
    }

}
