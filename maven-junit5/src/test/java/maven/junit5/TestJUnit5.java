package maven.junit5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class TestJUnit5 {
    
    @Test
    public void testOKAddition() {
        Library m = new Library();
        assertEquals(m.intAddition(1, 2), 3);
    }
    
    @Disabled @Test
    public void testFailureAddition() {
        Library m = new Library();
        assertEquals(m.doubleAddition(5.0, 6.0), 11.0, 0.001);
    }
    
    @Test
    public void testOKDivision() {
        Library m = new Library();
        assertEquals(m.division(1.0, 2.0), 0.5, 0.001);
    }
    
    @Disabled @Test
    public void testFailureDivision() {
        Library m = new Library();
        assertEquals(m.division(1.0, 1.0), 2.0, 0.001);
    }
    
    @Test
    public void testOKArray() {
        Library m = new Library();
        assertEquals(m.getFromArray(5), 5);
    }
    
    @Disabled @Test
    public void testErrorArray() {
        Library m = new Library();
        assertEquals(m.getFromArray(12), 12);
    }
    
    @Test
    public void testOKArrayIntAddition() {
        Library m = new Library();
        assertEquals(m.intAddition(m.getFromArray(3), m.getFromArray(9)), 12);
    }
    
    @Disabled @Test
    public void testShouldbeIgnored() {
        Library m = new Library();
        assertTrue(false);
    }
}
