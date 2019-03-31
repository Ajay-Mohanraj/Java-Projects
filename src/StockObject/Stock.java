package StockObject;

public class Stock {
    private static int numCompanies = 0;
    private String symbol, name;
    private double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
        Stock.numCompanies++;
    }
    public static int getNumCompanies(){
        return numCompanies;
    }
    public void setPreviousPrice(double prevPrice){
        previousClosingPrice = prevPrice;
    }
    public void setCurrentPrice(double currPrice){
        currentPrice = currPrice;
    }
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
