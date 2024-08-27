package com.ict4dev.benildo.unitconverter.service;

import com.ict4dev.benildo.unitconverter.model.Unit;

public class SpeedService {

    public static String convertSpeed(Unit unit) {
        double result = 0.0;
        String unitInput = "m/s";
        String unitOutput = "m/s";

        switch (unit.getIntputId()) {
            case 1: // From Meters per Second
                switch (unit.getOutputId()) {
                    case 2: result = metersPerSecondToKilometersPerHour(unit.getValue()); unitOutput = "km/h"; break;
                    case 3: result = metersPerSecondToMilesPerHour(unit.getValue()); unitOutput = "mph"; break;
                    case 4: result = metersPerSecondToKnots(unit.getValue()); unitOutput = "kn"; break;
                    case 5: result = metersPerSecondToFeetPerSecond(unit.getValue()); unitOutput = "ft/s"; break;
                    default: result = unit.getValue();
                }
                break;
            case 2: // From Kilometers per Hour
                unitInput = "km/h";
                switch (unit.getOutputId()) {
                    case 1: result = kilometersPerHourToMetersPerSecond(unit.getValue()); unitOutput = "m/s"; break;
                    case 3: result = kilometersPerHourToMilesPerHour(unit.getValue()); unitOutput = "mph"; break;
                    case 4: result = kilometersPerHourToKnots(unit.getValue()); unitOutput = "kn"; break;
                    case 5: result = kilometersPerHourToFeetPerSecond(unit.getValue()); unitOutput = "ft/s"; break;
                    default: result = unit.getValue();
                }
                break;
            case 3: // From Miles per Hour
                unitInput = "mph";
                switch (unit.getOutputId()) {
                    case 1: result = milesPerHourToMetersPerSecond(unit.getValue()); unitOutput = "m/s"; break;
                    case 2: result = milesPerHourToKilometersPerHour(unit.getValue()); unitOutput = "km/h"; break;
                    case 4: result = milesPerHourToKnots(unit.getValue()); unitOutput = "kn"; break;
                    case 5: result = milesPerHourToFeetPerSecond(unit.getValue()); unitOutput = "ft/s"; break;
                    default: result = unit.getValue();
                }
                break;
            case 4: // From Knots
                unitInput = "kn";
                switch (unit.getOutputId()) {
                    case 1: result = knotsToMetersPerSecond(unit.getValue()); unitOutput = "m/s"; break;
                    case 2: result = knotsToKilometersPerHour(unit.getValue()); unitOutput = "km/h"; break;
                    case 3: result = knotsToMilesPerHour(unit.getValue()); unitOutput = "mph"; break;
                    case 5: result = knotsToFeetPerSecond(unit.getValue()); unitOutput = "ft/s"; break;
                    default: result = unit.getValue();
                }
                break;
            case 5: // From Feet per Second
                unitInput = "ft/s";
                switch (unit.getOutputId()) {
                    case 1: result = feetPerSecondToMetersPerSecond(unit.getValue()); unitOutput = "m/s"; break;
                    case 2: result = feetPerSecondToKilometersPerHour(unit.getValue()); unitOutput = "km/h"; break;
                    case 3: result = feetPerSecondToMilesPerHour(unit.getValue()); unitOutput = "mph"; break;
                    case 4: result = feetPerSecondToKnots(unit.getValue()); unitOutput = "kn"; break;
                    default: result = unit.getValue();
                }
                break;
            default:
                return "Something went wrong";
        }

        // Return formatted result
        return unit.getValue() + " " + unitInput + " = " + result + " " + unitOutput;
    }

        // Convert Meters per Second to Kilometers per Hour
        private static double metersPerSecondToKilometersPerHour(double mps) {
            return mps * 3.6;
        }

        // Convert Meters per Second to Miles per Hour
        private static double metersPerSecondToMilesPerHour(double mps) {
            return mps * 2.236936;
        }

        // Convert Meters per Second to Knots
        private static double metersPerSecondToKnots(double mps) {
            return mps * 1.943844;
        }

        // Convert Meters per Second to Feet per Second
        private static double metersPerSecondToFeetPerSecond(double mps) {
            return mps * 3.28084;
        }

        // Convert Kilometers per Hour to Meters per Second
        private static double kilometersPerHourToMetersPerSecond(double kmh) {
            return kmh / 3.6;
        }

        // Convert Kilometers per Hour to Miles per Hour
        private static double kilometersPerHourToMilesPerHour(double kmh) {
            return kmh * 0.621371;
        }

        // Convert Kilometers per Hour to Knots
        private static double kilometersPerHourToKnots(double kmh) {
            return kmh * 0.539957;
        }

        // Convert Kilometers per Hour to Feet per Second
        private static double kilometersPerHourToFeetPerSecond(double kmh) {
            return kmh * 0.911344;
        }

        // Convert Miles per Hour to Meters per Second
        private static double milesPerHourToMetersPerSecond(double mph) {
            return mph * 0.44704;
        }

        // Convert Miles per Hour to Kilometers per Hour
        private static double milesPerHourToKilometersPerHour(double mph) {
            return mph * 1.609344;
        }

        // Convert Miles per Hour to Knots
        private static double milesPerHourToKnots(double mph) {
            return mph * 0.868976;
        }

        // Convert Miles per Hour to Feet per Second
        private static double milesPerHourToFeetPerSecond(double mph) {
            return mph * 1.466667;
        }

        // Convert Knots to Meters per Second
        private static double knotsToMetersPerSecond(double kn) {
            return kn * 0.514444;
        }

        // Convert Knots to Kilometers per Hour
        private static double knotsToKilometersPerHour(double kn) {
            return kn * 1.852;
        }

        // Convert Knots to Miles per Hour
        private static double knotsToMilesPerHour(double kn) {
            return kn * 1.150779;
        }

        // Convert Knots to Feet per Second
        private static double knotsToFeetPerSecond(double kn) {
            return kn * 1.68781;
        }

        // Convert Feet per Second to Meters per Second
        private static double feetPerSecondToMetersPerSecond(double fps) {
            return fps * 0.3048;
        }

        // Convert Feet per Second to Kilometers per Hour
        private static double feetPerSecondToKilometersPerHour(double fps) {
            return fps * 1.09728;
        }

        // Convert Feet per Second to Miles per Hour
        private static double feetPerSecondToMilesPerHour(double fps) {
            return fps * 0.681818;
        }

        // Convert Feet per Second to Knots
        private static double feetPerSecondToKnots(double fps) {
            return fps * 0.592484;
        }


}
