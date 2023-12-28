import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P67_AddBinaryTest {
    
    @Test
    public void testAddBinary() {
        P67_AddBinary binaryAddition = new P67_AddBinary();
        assertEquals("10010", binaryAddition.addBinary("1101", "101"), "10010");
        assertEquals("100", binaryAddition.addBinary("11", "1"), "100");
        assertEquals("10101", binaryAddition.addBinary("1010", "1011"), "10101");
        // Add more test cases as needed
    }
}
