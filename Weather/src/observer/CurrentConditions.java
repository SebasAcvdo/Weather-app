package observer;

import subject.Subject;

public class CurrentConditions implements Observer, Display {

    private float temperature;
    private float humidity;
    private Subject weatherData; 

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {


        this.temperature = temp;
        this.humidity = humidity;
        display(); 
        
    }

    @Override
    public void display() {
        System.out.println("Condiciones Actuales: " + temperature + "°C " + humidity + "% humedad");
    }
}

