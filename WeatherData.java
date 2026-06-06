public class WeatherData {

   private double temperature;
   private double humidity;

   WeatherData(double var1, double var3) {
      this.temperature = var1;
      this.humidity = var3;
   }

   static String checkAlert(double var0, double var2) {
      if (var0 > (double)40.0F && var2 > (double)80.0F) {
         return "High Temperature Alert and High Humidity Alert";
      } else if (var0 < (double)10.0F && var2 > (double)80.0F) {
         return "Low Temperature Alert and High Humidity Alert";
      } else if (var2 > (double)80.0F) {
         return "High Humidity Alert";
      } else if (var0 > (double)40.0F) {
         return "High Temperature Alert";
      } else {
         return var0 < (double)10.0F ? "Low Temperature Alert" : "Weather is Normal";
      }
   }

   String displayOutput() {
      double var10000 = this.temperature;
      return "Weather Report : \nTemperature : " + var10000 + "℃ \nHumidity : " + this.humidity + "% \nAlert : \n" + checkAlert(this.temperature, this.humidity);
   }
}

