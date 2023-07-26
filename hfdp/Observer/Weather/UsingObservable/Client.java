package hfdp.Observer.Weather.UsingObservable;

public class Client {
    public static void main(String[] args) {
        WeatherData w = new WeatherData();
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(w);
        w.setMeasurements(1,1,1);
        w.setMeasurements(2,2,2);

        NewDisplay n = new NewDisplay(w);
        w.setMeasurements(3,3,3);
        w.setMeasurements(4,4,4);
    }
}
