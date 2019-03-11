package exercises;

public class NotASquare {
    public static void main(String[] args) {
        Integer x;
        Integer y;
        //String x;
        //String y;
        java.util.Scanner in;
        in = new java.util.Scanner(System.in);
        System.out.println("Welcome to 'not a square' the program that calculates the area of your rectangle!");
        System.out.println("Enter the height: ");
        x = in.nextInt();
        System.out.println("Enter the width: ");
        y = in.nextInt();

        System.out.println("The area of your rectangle is:  " + (x*y));
        //System.out.println(x * y);
        //.parseInt()
    }
}
