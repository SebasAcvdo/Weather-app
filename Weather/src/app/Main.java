package app;

import observer.AtmosfericPressure;
import subject.WeatherData;
import observer.CurrentConditions;
import observer.ForecastDisplay;
import observer.HeatIndex;
import observer.WeatherStats;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();


        CurrentConditions currentDisplay = new CurrentConditions(weatherData);
        AtmosfericPressure currentPressure = new AtmosfericPressure(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        WeatherStats weatherStats = new WeatherStats(weatherData);
        HeatIndex heatIndexDisplay = new HeatIndex(weatherData);


        System.out.println( "Primer reporte:");
        weatherData.setMeasurements(26.5f, 65f, 1013f);

        System.out.println("\n Segundo reporte:");
        weatherData.setMeasurements(22.3f, 70f, 1009f);

        System.out.println("\n Tercer reporte:");
        weatherData.setMeasurements(30.0f, 50f, 1018f);
        
        
    }
}
