public class Stock {
    public String symbol;
    public String name;
    public double previousPrice;
    public double currentPrice;
    public double ret;

    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name   = name;
    }

    public double getChangePercent(double previousPrice,double currentPrice){
        ret = (currentPrice - previousPrice)/previousPrice;
        return ret;
    }
}
