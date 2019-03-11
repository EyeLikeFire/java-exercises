package exercises;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Integer miles;
        Integer gas;
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("How many Miles did you drive?");
        miles = in.nextInt();
        System.out.println("How much gas did you use?");
        gas = in.nextInt();
        System.out.println("Your MPG was " + (miles / gas));


    }
}
