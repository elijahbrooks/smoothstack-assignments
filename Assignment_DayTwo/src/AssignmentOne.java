/**
 * Take multiple values from the command line
 * and show the result of adding all of them.
 *
 * @author elijahbrooks
 */
public class AssignmentOne {
    /**
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Integer runningTotal = 0;
        for (String arg: args) {
            try{
                runningTotal += Integer.parseInt(arg);
            } catch (NumberFormatException exception) {
                runningTotal += 0;
            }
        }

        System.out.println(runningTotal);
    }
}
