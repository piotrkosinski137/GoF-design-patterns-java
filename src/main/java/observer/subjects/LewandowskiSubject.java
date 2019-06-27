package observer.subjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import observer.observers.Observer;

public class LewandowskiSubject implements Subject
{
    private List<Observer> observers = new ArrayList<>();
    private String celebrityName = "Robert Lewandowski";

    @Override
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer)
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status)
    {
        observers.forEach(observer -> observer.updateStatus(celebrityName, status));
    }

    public List<Observer> getObservers()
    {
        return Collections.unmodifiableList(observers);
    }
}
