public class Stock {
    private String symbol;
    private String name;
    public double previousPrice;
    public double currentPrice;
    private double ret;

    public Stock(String symbol,String name){
        this.symbol = symbol;
        this.name   = name;
    }

    public double getChangePercent(){
        ret = (currentPrice - previousPrice)/previousPrice;
        return ret;
    }
}
