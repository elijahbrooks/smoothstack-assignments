import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentThreeDayFiveTest {

    @Test
    public void getListOfStringsWithA(){
        AssignmentThreeDayFive newObject = new AssignmentThreeDayFive();
        List<String> listOfStrings = Arrays.asList("Elijah", "amm", "Is", "A", "Goat", "app");
        assertEquals(Arrays.asList("amm", "app"), newObject.getListOfStringsWithA(listOfStrings));
    }

}