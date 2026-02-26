
public class TemperatureConverter {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5 + 32);
    }

    public double kelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    public boolean isExtremeTemperature(double celsius) {
        if (celsius > -40 && celsius < 50) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = 77;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " F = " + celsius + " C");

        double c = 25;
        double f = converter.celsiusToFahrenheit(c);
        System.out.println(c + " C = " + f + " F");

        double kelvin = 300;
        double kelvinAsCelsius = converter.kelvinToCelsius(kelvin);
        System.out.println(kelvin + " K = " + kelvinAsCelsius + " C");

        System.out.println("Is " + celsius + " C extreme? " + converter.isExtremeTemperature(celsius));
    }
}