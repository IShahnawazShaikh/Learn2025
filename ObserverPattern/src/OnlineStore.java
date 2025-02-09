import observable.IphoneObservableImpl;
import observable.StockObservable;
import observer.EmailAlertObserverImpl;
import observer.MobileAlertObserverImpl;
import observer.NotificationAlertObserver;

public class OnlineStore {
    public static void main(String ...arg) {
        IphoneObservableImpl iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("sha@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("sha2@gmail.com", iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("123456", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);
        iphoneObservable.setStockCount(20);


        /**
         * Run - 2 : By setting stock to 0
         */

        System.out.println("Example -2");
        iphoneObservable.setStockCount(0);
        iphoneObservable.setStockCount(30);



    }
}
