package polymorphism;

public class Market {
    public static void main(String[] args){
        Fruit fruit = new Fruit();
        fruit.makeJuice();
//        apple
        Fruit apple = new Apple(95);
        System.out.println(apple.calories);
        apple.makeJuice();
        ((Apple)apple).removeSeed();
//        banana
        Fruit banana = new Banana(34);
        System.out.println(banana.calories);
        banana.makeJuice();
        ((Banana)banana).peel();
    }

}
