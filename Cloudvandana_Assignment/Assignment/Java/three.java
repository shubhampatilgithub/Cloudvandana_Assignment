public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input string
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase(); // Convert the input to lowercase to make it case-insensitive
        boolean[] alphabet = new boolean[26]; // We use an array of booleans to track the presence of each letter

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a'; // Convert the letter to an array index (0-25)
                alphabet[index] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters from A to Z are present
    }
}

// In this code, we first convert the input string to lowercase to make it
// case-insensitive. Then, we use a boolean array to keep track of the presence
// of each letter from 'a' to 'z'. We iterate through the characters in the
// input string, and if a character is a letter, we mark the corresponding index
// in the boolean array as true. After processing the entire string, we check if
// all the boolean values are true, which indicates that all letters from 'a' to
// 'z' are present, making it a pangram.


// output =
// The input is a pangram.