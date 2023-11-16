import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);

        // Shuffle the list
        Collections.shuffle(originalList);

        // Print the shuffled array
        System.out.println("Shuffled array: " + originalList);
    }
}

// In this code, we first create an ArrayList with the values you specified.
// Then, we use Collections.shuffle to shuffle the elements of the list
// randomly. Finally, we print the shuffled array.

// OUTPUT =

// Shuffled array: [6, 1, 4, 5, 7, 3, 2]