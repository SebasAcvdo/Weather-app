package observer;
import subject.Subject;

public class ForecastDisplay implements Observer, Display {
    private float currentPressure = 1013; 
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Pronóstico: ");
        if (currentPressure > lastPressure) {
            System.out.println("El clima mejora (más soleado y seco)");
        } else if (currentPressure == lastPressure) {
            System.out.println("El clima se mantiene estable");
        } else {
            System.out.println("Posibilidad de lluvia o tormentas");
        }
    }
}
