import java.util.Arrays;

/**
 * @author elijahbrooks
 */
public class AssignmentOneDayFive {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String stringArray[] = {"Elijah", "Brooks", "Is", "A", "Goat"};

        // Sorting array from shortest to longest.
        System.out.println("Sorting array from shortest to longest.");
        Arrays.sort(stringArray, (stringOne, stringTwo) ->
                stringOne.length() - stringTwo.length());
        for(String string : stringArray)
            System.out.println(string);

        // Sorting array from longest to shortest.
        System.out.println("Sorting array from longest to shortest.");
        Arrays.sort(stringArray, (stringOne, stringTwo) ->
                stringTwo.length() - stringOne.length());
        for(String string : stringArray)
            System.out.println(string);

        System.out.println("Sorting array alphabetically by the first character only.");
        // Sorting array alphabetically by the first character only.
        Arrays.sort(stringArray, (stringOne, stringTwo) ->
                stringOne.charAt(0) - stringTwo.charAt(0));
        for(String string : stringArray)
            System.out.println(string);

        System.out.println("Strings that contain 'e' first, everhting else second." );
        // Strings that contain 'e' first, everthing else second.
        Arrays.sort(stringArray, (stringOne, stringTwo) ->Integer.compare( // returns -1, 0, or 1
                    stringOne.contains("e") || stringOne.contains("E") ? 0 : 1, // if true return 0 else 1
                    stringTwo.contains("e") || stringTwo.contains("E") ? 0 : 1)); // if true return 0 else 1
        for(String string : stringArray)
            System.out.println(string);

        System.out.println("Strings that contain 'e' first, everhting else second.(with static)" );
        // Strings that contain 'e' first, everything else second. (with static)
        Arrays.sort(stringArray, (stringOne, stringTwo) -> yourMethod(stringOne, stringTwo));
        for(String string : stringArray)
            System.out.println(string);

    }

    /**
     *
     * @param stringOne first string to sort
     * @param stringTwo second string to sort
     * @return
     */
    static public int yourMethod(String stringOne, String stringTwo){
        return Integer.compare( // returns -1, 0, or 1
                stringOne.contains("e") || stringOne.contains("E") ? 0 : 1, // if true return 0 else 1
                stringTwo.contains("e") || stringTwo.contains("E") ? 0 : 1); // if true return 0 else 1
    }
}
