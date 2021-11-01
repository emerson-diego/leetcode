"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.BestTimeBuySellStock = void 0;
var BestTimeBuySellStock = /** @class */ (function () {
    function BestTimeBuySellStock() {
    }
    //console.log(maxProfit([7, 1, 5, 3, 6, 4]));
    BestTimeBuySellStock.prototype.maxProfit = function (prices) {
        var minValue = Number.MAX_VALUE;
        var maxProfit = 0;
        for (var i = 0; i < prices.length; i++) {
            if (prices[i] < minValue)
                minValue = prices[i];
            else if (prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    };
    return BestTimeBuySellStock;
}());
exports.BestTimeBuySellStock = BestTimeBuySellStock;
//# sourceMappingURL=BestTimeBuySellStock.js.map