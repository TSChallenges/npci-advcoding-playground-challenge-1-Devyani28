class StockPortfolio {
    // TODO: Add necessary fields for stock details
    private String symbol;
    private int quantity;
    private double buyingPrice;
    private double currentPrice;
    private double highestPrice;

    // TODO: Initialize stock details
    public StockPortfolio(String symbol, int quantity, double buyingPrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.buyingPrice = buyingPrice;
        currentPrice = buyingPrice;
        highestPrice = buyingPrice;
    }
    

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    public double getHighestPrice() {
        return highestPrice;
    }

    // TODO: Update current market price
    public void updatePrice(double newPrice) {
        if(newPrice>0){
        this.currentPrice = newPrice;
        if(highestPrice < newPrice){
            highestPrice = newPrice;
        }
        }
    }

    // TODO: Calculate total profit or loss
    public double calculateProfit() {
        return (currentPrice - buyingPrice) * quantity;;
    }

    // TODO: Calculate current total value of holdings
    public double getCurrentValue() {
        return currentPrice * quantity;
    }
}
