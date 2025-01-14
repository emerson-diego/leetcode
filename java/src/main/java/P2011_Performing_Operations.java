public class P2011_Performing_Operations {

    public static void main(String args[]) {

        String[] array = { "--X", "X++", "X++" };
        System.out.println(new P2011_Performing_Operations().finalValueAfterOperations(array));

    }

    public int finalValueAfterOperations(String[] operations) {

        int value = 0;

        for(String s: operations){
            if(s.contains("--"))
                value -= 1;
            else if(s.contains("++"))
                value += 1;
        }

        return value;
    }

}
