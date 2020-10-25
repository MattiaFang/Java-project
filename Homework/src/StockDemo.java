public class StockDemo {
    public static void main(String[] args) {
        Stock stock;
        stock = new Stock("600000","浦发银行");
        stock.previousPrice = 25.5;
        stock.currentPrice = 28.6;
        System.out.println(stock.getChangePercent());
    }
}
