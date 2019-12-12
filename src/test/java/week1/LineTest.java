package week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    public void getSlopeTest() {
        Line line1 = new Line(0, 0, 10, 10);
        assertEquals(1, line1.getSlope(), 0.0001, "The slope should be 1.");

        Line line2 = new Line(-3571, 420, 537, 1099);
        assertEquals(0.16528724440117, line2.getSlope(), 0.0001, "The slope should be 0.16528724440117.");

        Line line3 = new Line(0, 0, 10, 10);
        assertEquals(1, line3.getSlope(), 0.0001, "The slope should be 1.");
    }

    @Test
    public void getDistance() {
        Line testLine = new Line(0, 0, 10, 10);
        // ≈14.142135623730951

        assertEquals(14.142135623730951, testLine.getDistance(), 0.0001,
                "The distance should be approximately 14.142135623730951.");

    }

    @Test
    public void parallelTo() {
        Line testLine1 = new Line(0, 0, 10, 10);
        Line testLine2 = new Line(5, 0, 15, 10);

        assertEquals(true, testLine1.parallelTo(testLine2), "Should return true.");
    }
}
