import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeAPITest extends DateTimeAPI{

    @Test
    public void getPreviousThursday(){
        LocalDateTime randomDate = LocalDateTime.now();
        assertEquals(LocalDate.of(2021, 04, 8), getPreviousThursday(randomDate).toLocalDate());
    }

    @Test
    public void getDaysOfMonths(){
        Integer[] expectedArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        assertArrayEquals(expectedArray, getDaysOfMonths(2000));
    }
}