public class WeatherData {

    private double temperature;
    private double humidity;

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public static String checkAlert(double temperature, double humidity) {

        if (temperature > 40 && humidity > 80) {
            return "High Temperature Alert and High Humidity Alert";
        }

        if (temperature < 10 && humidity > 80) {
            return "Low Temperature Alert and High Humidity Alert";
        }

        if (humidity > 80) {
            return "High Humidity Alert";
        }

        if (temperature > 40) {
            return "High Temperature Alert";
        }

        if (temperature < 10) {
            return "Low Temperature Alert";
        }

        return "Weather is Normal";
    }

    public String displayOutput() {
        return "Weather Report:\n" +
               "Temperature: " + temperature + "°C\n" +
               "Humidity: " + humidity + "%\n" +
               "Alert: " + checkAlert(temperature, humidity);
    }

    public String toFileString() {
        return "Temperature: " + temperature + "°C, " +
               "Humidity: " + humidity + "%";
    }
}



