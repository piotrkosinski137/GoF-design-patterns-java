package observer.subjects;

import observer.observers.Observer;

public interface Subject
{
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers(String status);
}
