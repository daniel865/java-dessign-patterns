package observerpatternimproved;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    List<IObserver> observerList = new ArrayList<>();
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
        // Notify Observers
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(int i) {
        observerList.stream().forEach(observer -> observer.update(i));
    }
}
