package observerpatternassignment;

import java.util.ArrayList;
import java.util.List;

public class Subject2 implements ISubject {

    private int myValue;
    private List<IObserver> observerList = new ArrayList<>();


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
        observerList.stream().forEach(iObserver -> iObserver.update(this.getClass().getSimpleName(), i));
    }

}
