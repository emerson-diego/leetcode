public class P3110_Score_of_a_String {

    public static void main(String args[]) {
        P3110_Score_of_a_String instance = new P3110_Score_of_a_String();
        System.out.println(instance.scoreOfString("hello"));
    }

    public int scoreOfString(String s) {

        int score = 0;
        int length = s.length();

        for (int i = 0; i < (length -1); i++) {

            int currentChar = s.charAt(i); 
            int nextChar = s.charAt(i+1); 
        
            score += Math.abs((currentChar - nextChar));
        }
        return score;
    }

}
