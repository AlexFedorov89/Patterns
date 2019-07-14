package lesson2_Observer;

import lesson2_Observer.Observers.CurrentConditionsDisplay;
import lesson2_Observer.Observers.ForecastDisplay;
import lesson2_Observer.Observers.StatisticsDisplay;
import lesson2_Observer.Subjects.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(79, 90, 29.2f);
    }
}
