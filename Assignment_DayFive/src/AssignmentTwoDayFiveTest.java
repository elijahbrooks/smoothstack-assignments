import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTwoDayFiveTest {

    @Test
    public void setEvenAndOdd(){
        AssignmentTwoDayFive newObject = new AssignmentTwoDayFive();
        int[] intArray = {1, 2, 3, 4};

        assertEquals("o1,e2,o3,e4,", newObject.setEvenAndOdd(intArray));
    }

}