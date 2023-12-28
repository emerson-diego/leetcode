import java.math.BigInteger;

public class P67_AddBinary {
    
    public String addBinary(String a, String b) {
        
        BigInteger number1 = new BigInteger(a, 2);
        BigInteger number2 = new BigInteger(b, 2);
        
        BigInteger sum = number1.add(number2);
        
        return sum.toString(2);
        
    }
}
