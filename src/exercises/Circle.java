package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class Circle {
    public static void main (String[] args){
        Scanner in;
        in = new Scanner(System.in);

        //get user input from user:
        System.out.println("How many evens do you want to count?");
        int howMany = in.nextInt();
        //create an array based on user input:
        ArrayList<Integer> steven = new ArrayList<>();
        for (int i = 0; i <= howMany; i++){
            steven.add(i);
        }
        //Call evenStephen method and print results:
        System.out.println(evenStephen(steven));
}

    public static int evenStephen(ArrayList<Integer> steven){
        int addEvens = 0;
        for (int i : steven){
            if(i%2 == 0){
                addEvens += i;
            }
        }
        return addEvens;
}

}
