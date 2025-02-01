public class P2894 {

    public static void main(String[] args) {
        System.out.println(new P2894().differenceOfSums(10,3));
    }

    public int differenceOfSums(int n, int m) {
        var num1= 0;
        var num2= 0;

        for(int i=1; i<= n; i++){
            if(!(i % m == 0)) num1 += i;
            if(i % m == 0) num2 += i;
        }
        return num1 - num2;
    }

}
