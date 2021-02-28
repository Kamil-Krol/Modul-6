package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature()
    {
        double average = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet())
        {
            average = average + temperature.getValue();
        }

        return average;

    }

    public double calculateMedianTemperature()
    {
        List<Double> employeeById = new ArrayList<>(temperatures.values());


    }


}


//    int numberOfMeasurements = 0;
//    Double min = null;
//    double median = 0;
//    Map<String, Double> sortedMap = new HashMap<>();
//        for (Map.Entry<String, Double> temperature :
//        temperatures.getTemperatures().entrySet())
//        {
//        numberOfMeasurements++;
//        }
//        if(numberOfMeasurements%2==1) {
//        for (int i = 0; i < numberOfMeasurements / 2 + 1; i++) {
//        min = null;
//        for (Map.Entry<String, Double> temperature :
//        temperatures.getTemperatures().entrySet()) {
//        if (min == null) {
//        min = temperature.getValue();
//        }
//        if (min > temperature.getValue()) {
//        min = temperature.getValue();
//        }
//        }
//        if(i<=numberOfMeasurements/2)
//        {
//
//        }
//
//        }
//        System.out.println(min);
//        return min;
//        }
//        else {
//        for (int i = 0; i < numberOfMeasurements / 2 + 1; i++) {
//        min = null;
//        for (Map.Entry<String, Double> temperature :
//        temperatures.getTemperatures().entrySet()) {
//        if (min == null) {
//        min = temperature.getValue();
//        }
//        if (min > temperature.getValue()) {
//        min = temperature.getValue();
//        }
//        }
//        if(i==numberOfMeasurements/2 || i==numberOfMeasurements/2+1)
//        {
//        median = median + min;
//        }
//
//
//        }
//
//        return median/2;
//        }
