public class WeatherAdviser {
    
    public String provideWeatherAdvisory(int temperature) {
        
        if(temperature < 0) {
            return "It's freezing! Wear a heavy coat";
        }

        if(temperature <= 10)
        {
            return "It's cold! Bundle up";

        }

        if(temperature <= 20)
        {
            return "It's cool! A light jacket will do";
            
        }
           
            return "It's warm! Enjoy the day";
            
        

    }

    public static void main(String args[])
    {
        WeatherAdviser advice = new WeatherAdviser();
        System.out.println(advice.provideWeatherAdvisory(9));
    }
}
