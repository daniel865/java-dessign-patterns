package observerpatternimproved;

public class Observer1 implements IObserver {

    @Override
    public void update(int i) {
        System.out.println("Observer1: my value in Subject is now: " + i);
    }

}
