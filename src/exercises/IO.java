package exercises;

public class IO {
    public static void main(String[] args) {
        String name;
        java.util.Scanner in;
        in = new java.util.Scanner(System.in);

        System.out.println("Enter your name: ");
        name = in.next();
        System.out.println("Hello, " + name);
    }
}
/*
Exercises
Input/output: Modify your "Hello, World" program to prompt the user for their name, and greet them by name.

Numeric types: Write a program to calculate the area of a rectangle and print the answer to the console. You should prompt the user for the dimensions. (What data types should the dimensions be?)

Numeric types: Write a program that asks a user for the number of miles they have driven and the amount of gas they've consumed (in gallons), and print their miles-per-gallon.

Strings: The first sentence of Alice's Adventures in Wonderland is below. Store this sentence in a string, and then prompt the user for a term to search for within this string. Print whether or not the search term was found. See if you can make the search case-insensitive, so that searching for "alice", for example, prints true.
Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation.

 */
