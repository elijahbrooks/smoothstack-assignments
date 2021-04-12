import static org.junit.jupiter.api.Assertions.*;

/**
 * @author elijahbrooks
 */
class GroupSumClumpTest {

    /**
     * method to test groupSumClump of GroupSumClump class
     */
    @org.junit.jupiter.api.Test
    void groupSumClump() {
        GroupSumClump gsc = new GroupSumClump();
        int[] array1 = {2, 4, 8};
        int[] array2 = {1, 2, 4, 8, 1};
        int[] array3 = {2, 4, 4, 8};
        assertEquals(true, gsc.groupSumClump(0, array1, 10));
        assertEquals(true, gsc.groupSumClump(0, array2, 14));
        assertEquals(false, gsc.groupSumClump(0, array3, 14));
    }
}