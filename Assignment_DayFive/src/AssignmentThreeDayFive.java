import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author elijahbrooks
 */
public class AssignmentThreeDayFive {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        AssignmentThreeDayFive newObject = new AssignmentThreeDayFive();
        List<String> listOfStrings = Arrays.asList("Elijah", "amm", "Is", "A", "Goat", "app");

        List<String> listOfStringsWithA = newObject.getListOfStringsWithA(listOfStrings);

        for(String string : listOfStringsWithA)
            System.out.println(string);

    }

    public List<String> getListOfStringsWithA(List<String> listOfStrings){
        return listOfStrings.stream()
                .filter((string) ->
                        string.length() == 3 && (string.contains("a") || string.contains("A"))
                )
                .collect(Collectors.toList());
    }
}
