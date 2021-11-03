public class BestTimeBuySellStock {

    public static void main(String args[]) {
        int array[] = { 3, 3, 5, 0, 0, 3, 1, 4 };

        System.out.println(maxProfit(array));

    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minValue)
                minValue = prices[i];

            else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;

            }

        }

        return maxProfit;

    }

}
