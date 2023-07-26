package hfdp.Observer.Weather.UsingObservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer{
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable observable,Object obj){
       if(observable instanceof WeatherData){
           WeatherData w = (WeatherData)observable;
           this.temperature = w.getTemperature();
           this.humidity = w.getHumidity();
           this.pressure = w.getPressure();
           display();
       }


    }
    public void display(){
        System.out.println("CurrentConditionsDisplay: Temperature: "+temperature+" humidity: "+humidity+" pressure: "+pressure);
    }



}
