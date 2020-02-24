import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        Die die6 = new Die(6,1,1,1,1,1,2);
        die6.roll();

      /*  Die die20 = new Die(20);
        die20.roll();*/

        System.out.print(die6.value); // this would print a number between 1 and 6 inclusive

        //System.out.print(die20.value); // this would print a number between 1 and 20 inclusive
    }
}
