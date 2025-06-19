import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName) {
        this.stockName = stockName;
        this.observers = new ArrayList<>();
    }

    public void setStockPrice(double price) {
        this.stockPrice = price;
        System.out.println("\nStock price updated: " + stockName + " = ₹" + price);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer.getClass().getSimpleName() + " subscribed.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " unsubscribed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }
}
