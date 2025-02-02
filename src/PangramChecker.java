//Given a string sentence containing only lowercase English letters,
// return true if sentence is a pangram, or false otherwise.
// we are using bitmasking approach for this problem

import java.util.Scanner;

public class PangramChecker {

    public static boolean isPangram(String sentence) {
        int bitMask = 0;

        for (char c : sentence.toCharArray()) {
            // Ensure character is lowercase English letter
            if (c >= 'a' && c <= 'z') {
                bitMask |= (1 << (c - 'a')); // Set the bit corresponding to the letter
            }
        }

        // Check if all 26 bits are set (pangram)
        return bitMask == (1 << 26) - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase(); // Convert to lowercase

        // Check if the input is a pangram
        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is NOT a pangram.");
        }

        scanner.close();
    }
}
