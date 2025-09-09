
package observer;
import subject.Subject;

public class AtmosfericPressure implements Display, Observer{
    private float pressure;
    private Subject weatherData;

    public AtmosfericPressure(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Presión atmosferica: " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
    
}
