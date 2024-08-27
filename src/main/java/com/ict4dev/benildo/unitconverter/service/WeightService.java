package com.ict4dev.benildo.unitconverter.service;

import com.ict4dev.benildo.unitconverter.model.Unit;

public class WeightService {

    public static String convertWeight(Unit unit) {
        double result = 0.0;
        String unitInput ="G";
        String unitOutput ="G";


        switch (unit.getIntputId()) {
            case 1: // From Grams
                switch (unit.getOutputId()) {
                    case 2: result = gramsToKilograms(unit.getValue()); unitOutput="K"; break;
                    case 3: result = gramsToTons(unit.getValue()); unitOutput="T"; break;
                    case 4: result = gramsToPounds(unit.getValue()); unitOutput="lb"; break;
                        case 5: result = gramsToOunces(unit.getValue()); unitOutput="OZ"; break;
                    default: result = unit.getValue();
                }
                break;
            case 2: // From Kilograms
                unitInput = "K";
                switch (unit.getOutputId()) {
                    case 1: result = kilogramsToGrams(unit.getValue()); unitOutput="G"; break;
                    case 3: result = kilogramsToTons(unit.getValue()); unitOutput="T"; break;
                    case 4: result = kilogramsToPounds(unit.getValue()); unitOutput="lb"; break;
                    case 5: result = kilogramsToOunces(unit.getValue()); unitOutput="OZ"; break;
                    default: result = unit.getValue();
                }
                break;
            case 3: // From Tons
                unitInput = "T";
                switch (unit.getOutputId()) {
                    case 1: result = tonsToGrams(unit.getValue()); unitOutput="G"; break;
                    case 2: result = tonsToKilograms(unit.getValue());unitOutput="K"; break;
                    case 4: result = tonsToPounds(unit.getValue()); unitOutput="lb"; break;
                    case 5: result = tonsToOunces(unit.getValue()); unitOutput="OZ"; break;
                    default: result = unit.getValue();
                }
                break;
            case 4: // From Pounds
                unitInput = "lb";
                switch (unit.getOutputId()) {
                    case 1: result = poundsToGrams(unit.getValue()); unitOutput="G"; break;
                    case 2: result = poundsToKilograms(unit.getValue());unitOutput="K"; break;
                    case 3: result = poundsToTons(unit.getValue()); unitOutput="T"; break;
                    case 5: result = poundsToOunces(unit.getValue()); unitOutput="OZ"; break;
                    default: result = unit.getValue();
                }
                break;
            case 5: // From Ouces
                unitInput = "OZ";
                switch (unit.getOutputId()) {
                    case 1: result = ouncesToGrams(unit.getValue()); unitOutput="OZ"; break;
                    case 2: result = ouncesToKilograms(unit.getValue());unitOutput="K"; break;
                    case 3: result = ouncesToTons(unit.getValue()); unitOutput="T"; break;
                    case 4: result = ouncesToPounds(unit.getValue()); unitOutput="P"; break;
                    default: result = unit.getValue();
                }
                break;
            default:
                return "Something went wrong";
        }
        // Colocar lá no Front End
        return unit.getValue()+" "+unitInput+" = "+result+" "+unitOutput;
    }

    // Convert Kilograms to Pounds
    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Convert Kilograms to Grams
    public static double kilogramsToGrams(double kilograms) {
        return kilograms * 1000;
    }

    // Convert Kilograms to Ounces
    public static double kilogramsToOunces(double kilograms) {
        return kilograms * 35.274;
    }

    // Convert Kilograms to Tons
    public static double kilogramsToTons(double kilograms) {
        return kilograms / 1000;
    }

    // Convert Pounds to Kilograms
    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    // Convert Grams to Kilograms
    public static double gramsToKilograms(double grams) {
        return grams / 1000;
    }

    // Convert Grams to Tons
    public static double gramsToTons(double grams) {
        return grams / 1000000;
    }

    // Convert Grams to Pounds
    public static double gramsToPounds(double grams) {
        return grams * 0.00220462;
    }

    // Convert Grams to Ounces
    public static double gramsToOunces(double grams) {
        return grams * 0.03527396; //
    }

    // Convert Ounces to Kilograms
    public static double ouncesToKilograms(double ounces) {
        return ounces / 35.274;
    }

    // Convert Tons to Kilograms
    public static double tonsToKilograms(double tons) {
        return tons * 1000;
    }

    // Convert Ounces to Grams
    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    // Convert Ounces to Tons
    public static double ouncesToTons(double ounces) {
        return ounces / 32000;
    }

    // Convert Ounces to Pounds
    public static double ouncesToPounds(double ounces) {
        return ounces / 16;
    }

    // Convert Pounds to Grams
    public static double poundsToGrams(double pounds) {
        return pounds * 453.59237;
    }

    // Convert Pounds to Tons
    public static double poundsToTons(double pounds) {
        return pounds / 2000.0;
    }

    // Convert Pounds to Ounces
    public static double poundsToOunces(double pounds) {
        return pounds * 16.0;
    }

    // Convert Tons to Grams
    public static double tonsToGrams(double tons) {
        return tons * 1000000;
    }

    // Convert Tons to Pounds
    public static double tonsToPounds(double tons) {
        return tons * 2204.62;
    }

    // Convert Tons to Ounces
    public static double tonsToOunces(double tons) {
        return tons * 35273.96; // 1 tonelada = 35.273,96 onças
    }


}
