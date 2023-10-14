public class P58_LengthOfLastWord {
    
    public static void main(String[] args) {
        
        var s = "Hello World";
        System.out.println(new P58_LengthOfLastWord().lengthOfLastWord(s));
        
    }
    
    public int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        var lastString = array[array.length - 1];
        return lastString.length();
    }
}
