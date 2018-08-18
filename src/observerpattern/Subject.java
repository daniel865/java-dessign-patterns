package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    List<Observer> observerList = new ArrayList<>();
    private int _flag;

    public int get_flag() {
        return _flag;
    }

    public void set_flag(int _flag) {
        this._flag = _flag;
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.stream().forEach(Observer::update);
    }

}
