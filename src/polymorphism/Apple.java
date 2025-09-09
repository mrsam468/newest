package polymorphism;

public class Apple extends Fruit{
    public Apple(int calories){
        this.calories = calories;
    }
    public void makeJuice(){
        System.out.println("apple juice is made");
    }
    public void removeSeed(){
        System.out.println("apple seed is removed");
    }
}
