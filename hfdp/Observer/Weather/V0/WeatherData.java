package hfdp.Observer.Weather.V0;

public class WeatherData {
    int  temperature;
    int humidity;
    int pressure;


    public int getTemperature(){
        return temperature;
    }
    public int getHumidity(){
        return humidity;
    }
    public int getPressure(){
        return pressure;
    }
    public void measurementsChanged(){
        temperature = getTemperature();
        humidity = getPressure();
        pressure = getHumidity();

        /*
        currentConditions.update(temperature,humidity,pressure);
        statisticsDisplay.update(temperature,humidity,pressure);
        forecastDisplay.update(temperature,humidity,pressure);
         */

        /*
        problems with the implementation
        * here we are coding the implementations not to the supertype(interface)
        * any new types of display will result in the update the code which violates the ocp
        *
         */


    }
}
