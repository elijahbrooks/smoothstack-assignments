import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author elijahbrooks
 */
public class Functional {

    /**
     *
     * @param array of integers to grab the right digit of
     * @return array of integers of right digits from provided array.
     */
    public static Integer[] rightDigit(Integer[] array){
        return Arrays.stream(array)
                .map(num -> num % 10)
                .collect(Collectors.toList())
                .toArray(new Integer[array.length]);
    }

    /**
     *
     * @param array of integers to map over and multiply by 2
     * @return array of integers with doubled values.
     */
    public static Integer[] doubling(Integer[] array){
        return Arrays.stream(array)
                .map(num -> num * 2)
                .collect(Collectors.toList())
                .toArray(new Integer[array.length]);
    }

    /**
     *
     * @param array of strings to remove 'x' from.
     * @return array of strings without 'x'
     */
    public static String[] noX(String[] array){
        return Arrays.stream(array)
                .map(string -> string.replace("x", ""))
                .collect(Collectors.toList())
                .toArray(new String[array.length]);

    }
}
