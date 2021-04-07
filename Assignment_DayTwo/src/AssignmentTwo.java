/**
 * @author elijahbrooks
 */
public class AssignmentTwo {
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        int[] largestValueArray = {0, 0, 0};
        int[][] sampleArray = {
                {10, 9, 2, 5},
                {11, 20, 1, 5},
                {1, 2, 1, 6},
        };

        for (int row = 0; row < sampleArray.length; row++) {
            for (int k = 0; k < sampleArray[row].length; k++) {
                if (largestValueArray[0] < sampleArray[row][k]) {
                    setLargestValue(largestValueArray, sampleArray[row][k], row, k);
                }
            }
        }

        int value = largestValueArray[0];
        int row = largestValueArray[1];
        int column = largestValueArray[2];

        System.out.println("The largest value in the 2-dimensional array is: " + value
                + ".\nLocated at sampleArray[" + row + "][" + column + ']');
    }

    /**
     *
     * @param largestValueArray array holding the largest value information
     * @param value the largest value found currently
     * @param row the row of the largest value found currently
     * @param column the column of the largest value found currently
     */
   static void setLargestValue(int[] largestValueArray, int value, int row, int column){
        largestValueArray[0] = value;
        largestValueArray[1] = row;
        largestValueArray[2] = column;
    }
}
