public class P28_FindTheIndexOfTheFirstOccurrenceInaString {
    public static void main(String args[]) {
        
        var haystack = "leetcode";
        var needle = "leeto";
        System.out.println(new P28_FindTheIndexOfTheFirstOccurrenceInaString().strStr(haystack, needle));
        
    }
    
    public int strStr(String haystack, String needle) {
        
        return haystack.indexOf(needle);
        
    }
}
