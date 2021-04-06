/**
 * @author elijahbrooks
 */

public class AssignmentOne {
    /**
     *
     * @param args
     */
     public static void main(String[] args) {
         System.out.println("1)");
         printFirstPattern();

         System.out.println("2)");
         printSecondPattern();

         System.out.println("3)");
         printThirdPattern();

         System.out.println("4)");
         printFourthPattern();
    }

    /**
     *
     */
    public static void printFirstPattern(){
        for (int rows = 1; rows < 5; rows++) {
            for (int columns = 0; columns < rows ; columns++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(".........");
    }

    /**
     *
     */
    public static void printSecondPattern(){
        System.out.println("..........");
         for (int rows = 4; rows > 0; rows--){
             for (int columns = 0; columns < rows; columns++) {
                 System.out.print('*');
             }
             System.out.println();
         }
    }

    /**
     *
     */
    public static void printThirdPattern(){
        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 6; j++){
                System.out.print(' ');
            }
            for (int k = 1; k<(i * 2); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("...........");
    }

    /**
     *
     */
    public static void printFourthPattern() {
        System.out.println("............");
        for (int i = 6; i > 1; i--) {
            for (int j = i; j < 8; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k < ((i-2) * 2); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
