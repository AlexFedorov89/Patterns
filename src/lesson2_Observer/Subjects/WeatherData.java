package lesson2_Observer.Subjects;

import lesson2_Observer.Observers.Observer;

import java.util.ArrayList;

public class WeatherData implements Observable {

    private ArrayList<Observer> observers;
    private boolean changed;

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        setChanged();
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (isChanged()) {
            for (Observer elObserver :
                    observers) {
                elObserver.update(temperature, humidity, pressure);
            }

            changed = false;
        }
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public boolean isChanged() {
        return changed;
    }
}
