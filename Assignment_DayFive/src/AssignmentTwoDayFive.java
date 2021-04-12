import java.util.Arrays;

/**
 * @author elijahbrooks
 */

public class AssignmentTwoDayFive {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AssignmentTwoDayFive newObject = new AssignmentTwoDayFive();
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String newList = newObject.setEvenAndOdd(intArray);

        System.out.println(newList);

    }

    public String setEvenAndOdd(int[] intArray){
        return Arrays.stream(intArray)
                .mapToObj(i ->
                        (i%2) == 0 ? "e" + Integer.toString(i) :
                                "o" + Integer.toString(i))
                .reduce("", (stringOne, stringTwo) -> stringOne + stringTwo + ",");
    }
}
