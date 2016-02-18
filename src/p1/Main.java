package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sentence;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a sentence: ");
            sentence = input.nextLine();

            // Split the sentence into tokens
            String[] tokens = sentence.split(" +");

            // Print each word
            for (String each : tokens) System.out.println(each);

            // Print the number of words in the sentence
            System.out.println("number of words = " + tokens.length);

            System.out.println("You entered: " + sentence);

            System.out.println(isFirstCharCap(sentence) ? "First letter is a cap" :
                "First letter is not a cap");

            System.out.println(isLastCharPunctuation(sentence) ? "Sentence ends properly" :
                "Sentence does not end properly");

        } while (!sentence.equals(""));
    }

    static boolean isFirstCharCap (String arg) {

        // Is the first character a capital
        return Character.isUpperCase(arg.charAt(0));
    }

    static boolean isLastCharPunctuation(String arg) {
        // Try to match punctuations at the end of the sentence
        return arg.matches(".*[.!?]");
    }
}
