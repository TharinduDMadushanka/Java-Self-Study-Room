package Encapsulation;

/*
Temperature Converter:
Create a TemperatureConverter class with a private instance variable for temperature in Celsius.
Add public methods to set the temperature in Celsius and get the temperature in Fahrenheit.
*/

import java.util.Scanner;

public class Q1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        temperatureConvertor t1 = new temperatureConvertor();
        System.out.print("Enter temperature in °C :");
        int temp = input.nextInt();

        int far = t1.calcTemp(temp);
        System.out.println(far+" °F");

    }
}

class temperatureConvertor {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int calcTemp(int temp) {
        this.temperature = (temp * 9 / 5) + 32;
        return temperature;
    }
}
