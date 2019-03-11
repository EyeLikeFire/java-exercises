package exercises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.Scanner;
//import java.util.Arrays;

public class ArraysAndHashes {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Lydia");
        words.add("is");
        words.add("BAE");

        for(int i = 0; i < words.size(); i++ ){
            if (words.get(i).length() == 5){
                fiveLetterWords.add(words.get(i));
            }
        }
        System.out.println(words);
        System.out.println(fiveLetterWords);

        int[] someNumbersInArray = {1,1,2,3,5,8};

        for(int i : someNumbersInArray){
            System.out.println(i);
        }

        HashMap<Integer, String> students = new HashMap<Integer, String>();

        students.put(0, "Joe");
        students.put(1, "Moe");
        students.put(2, "Hary");

        System.out.println(students);
    }
}
