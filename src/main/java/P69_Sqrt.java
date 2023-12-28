public class P69_Sqrt {
    
    public static void main(String args[]) {
        new P69_Sqrt().mySqrt(8);
    }
    
    public int mySqrt(int x) {
        int minValue = 0;
        int maxValue = Math.min(x, 46340);
        int result = 0; // Inicializando com 0 para cobrir o caso x = 0
        
        while (minValue <= maxValue) {
            int mid = minValue + (maxValue - minValue) / 2;
            long multiply = (long) mid * mid;
            
            if (multiply <= x) {
                result = mid;
                minValue = mid + 1;
            } else {
                maxValue = mid - 1;
            }
        }
        return result;
    }
}
