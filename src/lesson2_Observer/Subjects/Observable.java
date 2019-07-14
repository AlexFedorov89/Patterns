package lesson2_Observer.Subjects;

import lesson2_Observer.Observers.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers();
    void setChanged();
    boolean isChanged();
}
