public class P509_FibonacciNumber {

    public static void main(String args[]) {
        int n = 4;

        System.out.println(new P509_FibonacciNumber().fib(n));

    }

    public int fib(int n) {
        if (n == 0) return 0;
        else if (n <= 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);

    }
}
