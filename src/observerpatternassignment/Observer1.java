package observerpatternassignment;

public class Observer1  implements IObserver {

    @Override
    public void update(String s, int i) {
        System.out.println("Observer1: observes ->myValue is changed in "+s+" to :"+i);
    }
}
