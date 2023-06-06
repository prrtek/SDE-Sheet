package Day2;

public class stock {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;

    for (int i = 0; i < prices.size(); i++) {
        int currentPrice = prices.get(i);
        minPrice = Math.min(minPrice, currentPrice);
        maxPro = Math.max(maxPro, currentPrice - minPrice);
    }

    return maxPro;
}
}
