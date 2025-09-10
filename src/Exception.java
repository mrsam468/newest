public class Exception {
    public static void main(String[] args){
        try {
            int c = 30 / 0;
            System.out.println("dividing is fun ");
        }catch(ArithmeticException e){
            System.out.println("dividing is fun");
        }

    }
}
