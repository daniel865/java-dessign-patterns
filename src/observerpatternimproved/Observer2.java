package observerpatternimproved;

public class Observer2 implements IObserver {

    @Override
    public void update(int i) {
        System.out.println("Observer2: my value in Subject is now: " + i);
    }

}
