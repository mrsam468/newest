package polymorphism;

public class Banana extends Fruit{
    public Banana(int calories){
        this.calories = calories;
    }
    public void makeJuice(){
        System.out.println("Banana juice is made");
    }
    public void peel(){
        System.out.println("banana is peeled");
    }
}
