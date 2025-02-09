package observer;

import observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    StockObservable observable;
    String email;
    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update(int stock) {
        sendEmail(email, "product is in stock");
    }

    private void sendEmail(String email, String message) {
      System.out.println("email sent to "+ email+" with message - "+ message);
    }
}
