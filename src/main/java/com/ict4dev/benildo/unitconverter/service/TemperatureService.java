package com.ict4dev.benildo.unitconverter.service;

import com.ict4dev.benildo.unitconverter.model.Unit;

public class TemperatureService {

        public static String convertTemperature(Unit unit) {
            double result = 0.0;
            String unitInput ="C";
            String unitOutput ="C";


            switch (unit.getIntputId()) {
                case 1: // From Celsius
                    switch (unit.getOutputId()) {
                        case 2: result = celsiusToFahrenheit(unit.getValue()); unitOutput="F"; break;
                        case 3: result = celsiusToKelvin(unit.getValue()); unitOutput="K"; break;
                        case 4: result = celsiusToRankine(unit.getValue()); unitOutput="R"; break;
                        default: result = unit.getValue();
                    }
                    break;
                case 2: // From Fahrenheit
                    unitInput = "F";
                    switch (unit.getOutputId()) {
                        case 1: result = fahrenheitToCelsius(unit.getValue()); unitOutput="C"; break;
                        case 3: result = fahrenheitToKelvin(unit.getValue()); unitOutput="K"; break;
                        case 4: result = fahrenheitToRankine(unit.getValue()); unitOutput="R"; break;
                        default: result = unit.getValue();
                    }
                    break;
                case 3: // From Kelvin
                    unitInput = "K";
                    switch (unit.getOutputId()) {
                        case 1: result = kelvinToCelsius(unit.getValue()); unitOutput="C"; break;
                        case 2: result = kelvinToFahrenheit(unit.getValue());unitOutput="F"; break;
                        case 4: result = kelvinToRankine(unit.getValue()); unitOutput="R"; break;
                        default: result = unit.getValue();
                    }
                    break;
                case 4: // De Rankine
                    unitInput = "R";
                    switch (unit.getOutputId()) {
                        case 1: result = rankineToCelsius(unit.getValue()); unitOutput="C"; break;
                        case 2: result = rankineToFahrenheit(unit.getValue());unitOutput="F"; break;
                        case 3: result = rankineToKelvin(unit.getValue()); unitOutput="K"; break;
                        default: result = unit.getValue();
                    }
                    break;
                default:
                    return "Something went wrong";
            }
            // Colocar lá no Front End
            return unit.getValue()+" "+unitInput+" = "+result+" "+unitOutput;
        }

    // Convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Celsius to Kelvin
    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Celsius to Rankine
    private static double celsiusToRankine(double celsius) {
        return (celsius + 273.15) * 9/5;
    }

    // Convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Convert Fahrenheit to Kelvin
    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5/9;
    }

    // Convert Fahrenheit to Rankine
    private static double fahrenheitToRankine(double fahrenheit) {
        return fahrenheit + 459.67;
    }

    // Convert Kelvin to Celsius
    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9/5) - 459.67;
    }

    // Convert Kelvin to Rankine
    private static double kelvinToRankine(double kelvin) {
        return kelvin * 9/5;
    }

    // Convert Rankine to Celsius
    private static double rankineToCelsius(double rankine) {
        return (rankine - 491.67) * 5/9;
    }

    // Convert Rankine to Fahrenheit
    private static double rankineToFahrenheit(double rankine) {
        return rankine - 459.67;
    }

    // Convert Rankine to Kelvin
    private static double rankineToKelvin(double rankine) {
        return rankine * 5/9;
    }

}
