package observerpatternimproved;

import observerpattern.Observer;

public class ObserverPatternImprovedEx {

    public static void main(String[] args) {
        System.out.println("*** Modified Observer Pattern ***");

        Subject subject = new Subject();
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        subject.register(observer1);
        subject.register(observer2);

        subject.setMyValue(5);
        System.out.println();
        subject.setMyValue(25);
        System.out.println();

        // Unregister observer1 only
        subject.unregister(observer1);

        // Now only observer2 will observe the change
        subject.setMyValue(100);
    }

}
