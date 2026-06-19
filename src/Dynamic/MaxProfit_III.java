package Dynamic;

class Solution03 {
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = 0;

        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;

        for (int price : prices) {
            firstBuy = Math.max(firstBuy, -price);
            firstSell = Math.max(firstSell, firstBuy + price);

            secondBuy = Math.max(secondBuy, firstSell - price);
            secondSell = Math.max(secondSell, secondBuy + price);
        }

        return secondSell;
    }
}

public class MaxProfit_III {

    public static void main(String[] args) {
        Solution03 S03 = new Solution03();

        System.out.println(S03.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
    }
}
