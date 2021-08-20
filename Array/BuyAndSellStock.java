package Array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        var list = new int[] { 1, 2, 5, 3, 6, 4 };
        var op = maxProfitOnePass(list);
        System.out.println(op);
    }

    static int maxProfitBF(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }
        if (max < 0) {
            return 0;
        }
        return max;
    }

    static int maxProfitOnePass(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
