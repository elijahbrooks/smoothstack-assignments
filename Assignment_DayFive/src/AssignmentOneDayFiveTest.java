import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentOneDayFiveTest {

    @Test
    public void yourMethod(){
        AssignmentOneDayFive newObject = new AssignmentOneDayFive();

        String[] stringArray = {"Hello", "World"};
        assertEquals(-1, newObject.yourMethod("Hello", "World"));
    }
}