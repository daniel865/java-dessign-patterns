package observerpattern;

public class ObserverPatternEx {

    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demo ***");
        Observer  observer1 = new Observer();
        Subject subject1 = new Subject();
        subject1.register(observer1);
        System.out.println("Setting flag = 5");
        subject1.set_flag(5);
        System.out.println("Setting flag = 25");
        subject1.set_flag(25);
        subject1.unregister(observer1);
        // No notification this time. Since it is unregistered
        System.out.println("Setting flag = 50");
        subject1.set_flag(50);
    }

}
