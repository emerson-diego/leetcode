export class BestTimeBuySellStock {
  //console.log(maxProfit([7, 1, 5, 3, 6, 4]));

  maxProfit(prices: number[]): number {
    let minValue = Number.MAX_VALUE;
    let maxProfit = 0;

    for (let i = 0; i < prices.length; i++) {
      if (prices[i] < minValue) minValue = prices[i];
      else if (prices[i] - minValue > maxProfit) {
        maxProfit = prices[i] - minValue;
      }
    }

    return maxProfit;
  }
}
