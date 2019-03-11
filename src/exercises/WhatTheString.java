package exercises;
import java.util.Scanner;

public class WhatTheString {

    public static void main (String[] args) {
        String story = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        story = story.toLowerCase();
        String search;
        String searchLower;
        Integer index;
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Enter you search term:");
        search = in.next();
        searchLower = search.toLowerCase();
        index = story.indexOf(searchLower);

        if(index > -1){
            System.out.println("'" + search + "' was found");
        } else {
            System.out.println("'" + search + "' was not found");
        }

    }

}
