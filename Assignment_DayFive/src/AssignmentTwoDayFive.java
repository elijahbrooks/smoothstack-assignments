import java.util.Arrays;

public class AssignmentTwoDayFive {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String newList = Arrays.stream(intArray)
                .mapToObj(i ->
                     (i%2) == 0 ? "e" + Integer.toString(i) :
                            "o" + Integer.toString(i))
                .reduce("", (stringOne, stringTwo) -> stringOne + stringTwo + ",");

        System.out.println(newList);

    }
}
