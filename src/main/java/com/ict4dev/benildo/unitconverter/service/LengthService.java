package com.ict4dev.benildo.unitconverter.service;

import com.ict4dev.benildo.unitconverter.model.Unit;

public class LengthService {

    public static String convertLength(Unit unit) {
        double result = 0.0;
        String unitInput = "m";
        String unitOutput = "m";

        switch (unit.getIntputId()) {
            case 1: // From Meters
                switch (unit.getOutputId()) {
                    case 2: result = metersToKilometers(unit.getValue()); unitOutput = "km"; break;
                    case 3: result = metersToMiles(unit.getValue()); unitOutput = "mi"; break;
                    case 4: result = metersToYards(unit.getValue()); unitOutput = "yd"; break;
                    case 5: result = metersToInches(unit.getValue()); unitOutput = "in"; break;
                    default: result = unit.getValue();
                }
                break;
            case 2: // From Kilometers
                unitInput = "km";
                switch (unit.getOutputId()) {
                    case 1: result = kilometersToMeters(unit.getValue()); unitOutput = "m"; break;
                    case 3: result = kilometersToMiles(unit.getValue()); unitOutput = "mi"; break;
                    case 4: result = kilometersToYards(unit.getValue()); unitOutput = "yd"; break;
                    case 5: result = kilometersToInches(unit.getValue()); unitOutput = "in"; break;
                    default: result = unit.getValue();
                }
                break;
            case 3: // From Miles
                unitInput = "mi";
                switch (unit.getOutputId()) {
                    case 1: result = milesToMeters(unit.getValue()); unitOutput = "m"; break;
                    case 2: result = milesToKilometers(unit.getValue()); unitOutput = "km"; break;
                    case 4: result = milesToYards(unit.getValue()); unitOutput = "yd"; break;
                    case 5: result = milesToInches(unit.getValue()); unitOutput = "in"; break;
                    default: result = unit.getValue();
                }
                break;
            case 4: // From Yards
                unitInput = "yd";
                switch (unit.getOutputId()) {
                    case 1: result = yardsToMeters(unit.getValue()); unitOutput = "m"; break;
                    case 2: result = yardsToKilometers(unit.getValue()); unitOutput = "km"; break;
                    case 3: result = yardsToMiles(unit.getValue()); unitOutput = "mi"; break;
                    case 5: result = yardsToInches(unit.getValue()); unitOutput = "in"; break;
                    default: result = unit.getValue();
                }
                break;
            case 5: // From Inches
                unitInput = "in";
                switch (unit.getOutputId()) {
                    case 1: result = inchesToMeters(unit.getValue()); unitOutput = "m"; break;
                    case 2: result = inchesToKilometers(unit.getValue()); unitOutput = "km"; break;
                    case 3: result = inchesToMiles(unit.getValue()); unitOutput = "mi"; break;
                    case 4: result = inchesToYards(unit.getValue()); unitOutput = "yd"; break;
                    default: result = unit.getValue();
                }
                break;
            default:
                return "Something went wrong";
        }
        // Return the formatted result
        return unit.getValue() + " " + unitInput + " = " + result + " " + unitOutput;
    }

        // Convert meters to kilometers
        public static double metersToKilometers(double meters) {
            return meters / 1000;
        }

        // Convert meters to miles
        public static double metersToMiles(double meters) {
            return meters * 0.000621371;
        }

        // Convert meters to yards
        public static double metersToYards(double meters) {
            return meters * 1.09361;
        }

        // Convert meters to inches
        public static double metersToInches(double meters) {
            return meters * 39.3701;
        }

        // Convert kilometers to meters
        public static double kilometersToMeters(double kilometers) {
            return kilometers * 1000;
        }

        // Convert kilometers to miles
        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }

        // Convert kilometers to yards
        public static double kilometersToYards(double kilometers) {
            return kilometers * 1093.61;
        }

        // Convert kilometers to inches
        public static double kilometersToInches(double kilometers) {
            return kilometers * 39370.1;
        }

        // Convert miles to meters
        public static double milesToMeters(double miles) {
            return miles / 0.000621371;
        }

        // Convert miles to kilometers
        public static double milesToKilometers(double miles) {
            return miles / 0.621371;
        }

        // Convert miles to yards
        public static double milesToYards(double miles) {
            return miles * 1760;
        }

        // Convert miles to inches
        public static double milesToInches(double miles) {
            return miles * 63360;
        }

        // Convert yards to meters
        public static double yardsToMeters(double yards) {
            return yards / 1.09361;
        }

        // Convert yards to kilometers
        public static double yardsToKilometers(double yards) {
            return yards / 1093.61;
        }

        // Convert yards to miles
        public static double yardsToMiles(double yards) {
            return yards / 1760;
        }

        // Convert yards to inches
        public static double yardsToInches(double yards) {
            return yards * 36;
        }

        // Convert inches to meters
        public static double inchesToMeters(double inches) {
            return inches / 39.3701;
        }

        // Convert inches to kilometers
        public static double inchesToKilometers(double inches) {
            return inches / 39370.1;
        }

        // Convert inches to miles
        public static double inchesToMiles(double inches) {
            return inches / 63360;
        }

        // Convert inches to yards
        public static double inchesToYards(double inches) {
            return inches / 36;
        }

}
