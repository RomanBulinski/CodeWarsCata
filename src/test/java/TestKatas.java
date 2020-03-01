import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestKatas {

// PENDULUM

    private static void doTest1(final int[] values, final int[] expected) {
        final int[] actual = Katas.pendulum2(values);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void CheckShortLengthPositives3() {
        doTest1(new int[]{4, 10, 9}, new int[]{10, 4, 9});
        doTest1(new int[]{6, 6, 8, 5, 10}, new int[]{10, 6, 5, 6, 8});
        doTest1(new int[]{20, 19, 25, 16, 19, 30, 18, 24}, new int[]{25, 20, 19, 16, 18, 19, 24, 30});
        doTest1(new int[]{49, 40, 41, 41, 39, 43, 40, 46, 30, 47, 46, 40}, new int[]{47, 46, 41, 40, 40, 30, 39, 40, 41, 43, 46, 49});
        doTest1(new int[]{-9, -2, -10, -6}, new int[]{-6, -10, -9, -2});
        doTest1(new int[]{-33, -21, -6, -29, -24, -5, -50, -42, -43, -17, -17}, new int[]{-5, -17, -21, -29, -42, -50, -43, -33, -24, -17, -6});
    }

//-------------------------------------------------------------------------------------------------------------------------------------

    // test for method : public static int[] menFromBoys(final int[] values)
    @Test
    public void checkPositiveValues() {
        doTest2(new int[]{7, 3, 14, 17}, new int[]{14, 17, 7, 3});
        doTest2(new int[]{2, 43, 95, 90, 37}, new int[]{2, 90, 95, 43, 37});
        doTest2(new int[]{20, 33, 50, 34, 43, 46}, new int[]{20, 34, 46, 50, 43, 33});
        doTest2(new int[]{82, 91, 72, 76, 76, 100, 85}, new int[]{72, 76, 82, 100, 91, 85});
        doTest2(new int[]{-53, -26, -53, -27, -49, -51, -14}, new int[]{-26, -14, -27, -49, -51, -53});
        doTest2(new int[]{-17, -45, -15, -33, -85, -56, -86, -30}, new int[]{-86, -56, -30, -15, -17, -33, -45, -85});
        doTest2(new int[]{63, -57, 76, -85, 88, 2, -28}, new int[]{-28, 2, 76, 88, 63, -57, -85});
        doTest2(new int[]{49, 818, -282, 900, 928, 281, -282, -1}, new int[]{-282, 818, 900, 928, 281, 49, -1});
    }

    void doTest2(final int[] values, final int[] expected) {
        int[] actual = Katas.menFromBoys(values);
        assertArrayEquals(expected, actual);
    }


}
