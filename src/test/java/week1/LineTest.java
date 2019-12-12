package week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LineTest {
    double delta = 0.0001;

    @Test
    public void getSlopeTest() {
        Line line1 = new Line(0, 0, 10, 10);
        double actual1 = line1.getSlope();
        double expected1 = 1;
        assertEquals(actual1, expected1, delta, "The slope should be 1.");

        Line line2 = new Line(-3571, 420, 537, 1099);
        double actual2 = line2.getSlope();
        double expected2 = 0.16528724440117;
        assertEquals(expected2, actual2, delta, "The slope should be 0.16528724440117.");

        Line line4 = new Line(-5, 0, 5, 0);
        double actual4 = line4.getSlope();
        double expected4 = 0;
        assertEquals(expected4, actual4, delta);
    }

    @Test
    public void getDistance() {
        Line line1 = new Line(0, 0, 10, 10);
        double expected1 = 14.142135623730951;

        assertEquals(expected1, line1.getDistance(), 0.0001, "The distance should be approximately " + expected1);

        Line line2 = new Line(-3571, 420, 537, 1099);
        double expected2 = 4163.7369033117;

        assertEquals(expected2, line2.getDistance(), 0.0001, "The distance should be approximately " + expected2);

        // Line line3 = new Line(0, 0, 10, 10);
        // double expected3 =

        // assertEquals(expected3, line3.getDistance(), 0.0001,
        // "The distance should be approximately 14.142135623730951.");
    }

    @Test
    public void parallelTo() {
        Line line1 = new Line(0, 0, 10, 10);
        Line line2 = new Line(5, 0, 15, 10);
        assertTrue(line1.parallelTo(line2), "Should return true.");

        // Line line3 = new Line(-5, 0, 5, 0);
        // Line line4 = new Line(0, -5, 0, 5);
        // assertFalse(line3.parallelTo(line4), "Should return false.");

        // Line line5 = new Line(0, 0, 0, 0);
        // Line line6 = new Line(0, -5, 0, -5);
        // assertFalse(line5.parallelTo(line6), "Should return false.");

    }
}
