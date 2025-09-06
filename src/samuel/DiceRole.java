package samuel;

public class DiceRole {
    public static void main(String[] arg){
int count = 0;
int expected = 20;

for(int i = 0; i <5;i++){
int random = (int)Math.floor(Math.random()*6)+1;
while(count<expected){
    count+=random;
    int subtract = count-expected;
    int minus=expected-count;
    if(count<expected){
        System.out.println("you are at the number "+count);
        System.out.println("sorry you are below the expected score by "+minus);
    }
    else if(count>expected) {
        System.out.println("you are at the number "+count);
        System.out.println("sorry you exceed the expected number by "+subtract);
    }
    else{
        System.out.println("you are at the number "+count);
        System.out.println("congratulation you won");
    }
    count++;
}

//for()
}
//        System.out.println(count);

    }
    }

