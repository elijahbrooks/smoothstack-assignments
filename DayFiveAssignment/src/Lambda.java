import java.util.function.Consumer;

/**
 * @author elijahbrooks
 */
public class Lambda {

    /**
     * prints out if integer is even or odd
     * @return consumer
     */
    public static Consumer<Integer> isOdd(){
         return number -> {
            if(number % 2 != 0)
                System.out.println("ODD");
            else
                System.out.println("EVEN");
        };
    }

    /**
     *  prints if number is prime or composite
     * @return consumer
     */
    public static Consumer<Integer> isPrime(){
        return number -> {
            boolean flag = true;
            for (int i = 2; i <= number / 2; ++i) {
                if (number % i == 0)
                    flag = false;
                    break;
            }
            if(flag)
                System.out.println("PRIME");
            else
                System.out.println("COMPOSITE");
        };
    }

    /**
     * prints if string is a palindrome or not.
     * @return consumer
     */
    public static Consumer<String> isPalindrome(){
        return string -> {
            int i = 0;
            int stringLength = string.length() - 1;
            boolean flag = true;

            while (i < stringLength && flag) {
                if (string.charAt(i) != string.charAt(stringLength))
                    flag = false;
                i++;
                stringLength--;
            }
            if(flag)
                System.out.println("PALINDROME");
            else
                System.out.println("NOT PALINDROME");
        };
    }
}
