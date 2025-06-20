public class Main {
    public static void main(String[] args) {

        StockMarket tcsStock = new StockMarket("TCS");

        // Create observers
        Observer mobileUser = new MobileApp("Ravi");
        Observer webUser = new WebApp("Priya");

        // Register observers
        tcsStock.registerObserver(mobileUser);
        tcsStock.registerObserver(webUser);

        // Price changes
        tcsStock.setStockPrice(3200.50);
        tcsStock.setStockPrice(3300.75);

        // Unregister mobile user
        tcsStock.removeObserver(mobileUser);

        // Another price change
        tcsStock.setStockPrice(3400.00);
    }
}
