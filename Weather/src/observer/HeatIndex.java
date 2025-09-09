package observer;
import subject.Subject;

public class HeatIndex implements Observer, Display {
    private float heatIndex = 0.0f;
    private Subject weatherData;

    public HeatIndex(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float t, float h, float p) {
        heatIndex = computeHeatIndex(t, h);
        display();
    }

    private float computeHeatIndex(float T, float R) {
       
        return (float)(
            -8.78469475556
            + (1.61139411 * T)
            + (2.33854883889 * R)
            + (-0.14611605 * T * R)
            + (-0.012308094 * T * T)
            + (-0.0164248277778 * R * R)
            + (0.002211732 * T * T * R)
            + (0.00072546 * T * R * R)
            + (-0.000003582 * T * T * R * R)
        );
    }

    @Override
    public void display() {
        System.out.println("Índice de calor: " + heatIndex + " °C");
    }
}

