import java.util.ArrayList;
import java.util.List;

interface Stock {
    void register(Observer observer);
    void deregister(Observer observer);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public StockMarket(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}


interface Observer {
    void update(String stockName, double price);
}


class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Mobile App: Stock " + stockName + " price updated to " + price);
    }
}


class WebApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("Web App: Stock " + stockName + " price updated to " + price);
    }
}


public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("ABC Corp", 100.0);

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        System.out.println("Initial stock price update:");
        stockMarket.setPrice(105.0);

        System.out.println("\nDeregistering Web App and updating stock price:");
        stockMarket.deregister(webApp);
        stockMarket.setPrice(110.0);
    }
}
