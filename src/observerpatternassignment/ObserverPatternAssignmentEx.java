package observerpatternassignment;

public class ObserverPatternAssignmentEx {

    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Assignment ***");
        Subject1 subject1 = new Subject1();
        Subject2 subject2 = new Subject2();

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();

        // Observer1 and Observer2 registers to Subject1
        subject1.register(observer1);
        subject2.register(observer2);

        // Observer2 and Observer3 registers to Subject2
        subject2.register(observer2);
        subject2.register(observer3);

        // Set new value to Subject1
        // Observer1 and Observer2 get notification
        subject1.setMyValue(50);
        System.out.println();

        // Set new value to Subject2
        // Observer2 and Observer3 get notification
        subject2.setMyValue(250);
        System.out.println();

        // Unregister Observer2 from Subject1
        subject1.unregister(observer2);

        // Set new value to Subject1 and only Observer1 is notified
        subject1.setMyValue(550);
        System.out.println();

        // Observer2 can still notice the change in Subject2
        subject2.setMyValue(750);
    }

}
