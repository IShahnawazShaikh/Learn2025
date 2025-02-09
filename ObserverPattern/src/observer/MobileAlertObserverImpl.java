package observer;

import observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    StockObservable observable;
    String phone;

    public MobileAlertObserverImpl(String phone, StockObservable observable) {
        this.phone = phone;
        this.observable = observable;
    }

    @Override
    public void update(int stock) {
        sendMessage(phone, "product is in stock");
    }

    private void sendMessage(String phone, String message) {
        System.out.println("message sent to "+ phone+" with message - "+ message);
    }
}
