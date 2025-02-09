package observable;

import observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int  stockCount = 0;
    public String productName = "Iphone16";

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
       notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {

        for(NotificationAlertObserver notificationAlertObserver : notificationAlertObserverList) {
            notificationAlertObserver.update(stockCount);
        }
    }

    public void setStockCount(int newStock) {
        if(stockCount == 0) {
            notifySubscribers();
        }
        this.stockCount =  newStock;  // Ideally it will be this.stockCount =  this.stockCount + newStock;
    }
}
