import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Replace this with the Roman numeral you want to convert
        int result = romanToInteger(romanNumeral);
        System.out.println(romanNumeral + " = " + result);
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }
}

// In this code, we define a romanToInteger function that takes a Roman numeral
// string as input and converts it to an integer. It uses a HashMap to map Roman
// numerals to their corresponding integer values and iterates through the input
// string from right to left. If the current numeral is smaller than the
// previous one, we subtract its value; otherwise, we add it to the total.
// Finally, we return the total as the integer equivalent of the Roman numeral.

// output = 
// IX = 9