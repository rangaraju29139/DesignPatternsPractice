package hfdp.Observer.Weather.UsingObservable;

import java.util.Observable;
import java.util.Observer;

public class NewDisplay implements Observer    {
    float temperature;
    float humidity;;
    Observable observable;


    public NewDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);

    }

    public void update(Observable observable, Object obj){
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
    public void display(){
        System.out.println("NewDisplay: Temperature: "+temperature + " Humidity: "+humidity);
    }
}
