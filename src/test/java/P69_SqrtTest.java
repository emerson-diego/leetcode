import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P69_SqrtTest {
    
    @Test
    public void testSqrtOfFour() {
        assertEquals(2, new P69_Sqrt().mySqrt(4));
    }
    
    @Test
    public void testSqrtOfEight() {
        assertEquals(2, new P69_Sqrt().mySqrt(8));
    }
}
