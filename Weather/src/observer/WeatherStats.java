package observer;
import subject.Subject;

public class WeatherStats implements Observer, Display {
    private int updateCount = 0;
    private Subject weatherData;

    public WeatherStats(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        updateCount++;
        display();
    }

    @Override
    public void display() {
        System.out.println("Número de lecturas de clima: " + updateCount);
    }
}
