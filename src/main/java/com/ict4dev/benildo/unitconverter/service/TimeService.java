package com.ict4dev.benildo.unitconverter.service;

import com.ict4dev.benildo.unitconverter.model.Unit;

public class TimeService {

    public static String convertTime(Unit unit) {
        double result = 0.0;
        String unitInput = "s";
        String unitOutput = "s";

        switch (unit.getIntputId()) {
            case 1: // From Seconds
                switch (unit.getOutputId()) {
                    case 2: result = secondsToMinutes(unit.getValue()); unitOutput = "min"; break;
                    case 3: result = secondsToHours(unit.getValue()); unitOutput = "h"; break;
                    case 4: result = secondsToDays(unit.getValue()); unitOutput = "d"; break;
                    case 5: result = secondsToWeeks(unit.getValue()); unitOutput = "w"; break;
                    case 6: result = secondsToYears(unit.getValue()); unitOutput = "y"; break;
                    default: result = unit.getValue();
                }
                break;
            case 2: // From Minutes
                unitInput = "min";
                switch (unit.getOutputId()) {
                    case 1: result = minutesToSeconds(unit.getValue()); unitOutput = "s"; break;
                    case 3: result = minutesToHours(unit.getValue()); unitOutput = "h"; break;
                    case 4: result = minutesToDays(unit.getValue()); unitOutput = "d"; break;
                    case 5: result = minutesToWeeks(unit.getValue()); unitOutput = "w"; break;
                    case 6: result = minutesToYears(unit.getValue()); unitOutput = "y"; break;
                    default: result = unit.getValue();
                }
                break;
            case 3: // From Hours
                unitInput = "h";
                switch (unit.getOutputId()) {
                    case 1: result = hoursToSeconds(unit.getValue()); unitOutput = "s"; break;
                    case 2: result = hoursToMinutes(unit.getValue()); unitOutput = "min"; break;
                    case 4: result = hoursToDays(unit.getValue()); unitOutput = "d"; break;
                    case 5: result = hoursToWeeks(unit.getValue()); unitOutput = "w"; break;
                    case 6: result = hoursToYears(unit.getValue()); unitOutput = "y"; break;
                    default: result = unit.getValue();
                }
                break;
            case 4: // From Days
                unitInput = "d";
                switch (unit.getOutputId()) {
                    case 1: result = daysToSeconds(unit.getValue()); unitOutput = "s"; break;
                    case 2: result = daysToMinutes(unit.getValue()); unitOutput = "min"; break;
                    case 3: result = daysToHours(unit.getValue()); unitOutput = "h"; break;
                    case 5: result = daysToWeeks(unit.getValue()); unitOutput = "w"; break;
                    case 6: result = daysToYears(unit.getValue()); unitOutput = "y"; break;
                    default: result = unit.getValue();
                }
                break;
            case 5: // From Weeks
                unitInput = "w";
                switch (unit.getOutputId()) {
                    case 1: result = weeksToSeconds(unit.getValue()); unitOutput = "s"; break;
                    case 2: result = weeksToMinutes(unit.getValue()); unitOutput = "min"; break;
                    case 3: result = weeksToHours(unit.getValue()); unitOutput = "h"; break;
                    case 4: result = weeksToDays(unit.getValue()); unitOutput = "d"; break;
                    case 6: result = weeksToYears(unit.getValue()); unitOutput = "y"; break;
                    default: result = unit.getValue();
                }
                break;
            case 6: // From Years
                unitInput = "y";
                switch (unit.getOutputId()) {
                    case 1: result = yearsToSeconds(unit.getValue()); unitOutput = "s"; break;
                    case 2: result = yearsToMinutes(unit.getValue()); unitOutput = "min"; break;
                    case 3: result = yearsToHours(unit.getValue()); unitOutput = "h"; break;
                    case 4: result = yearsToDays(unit.getValue()); unitOutput = "d"; break;
                    case 5: result = yearsToWeeks(unit.getValue()); unitOutput = "w"; break;
                    default: result = unit.getValue();
                }
                break;
            default:
                return "Something went wrong";
        }

        // Output formatted result
        return unit.getValue() + " " + unitInput + " = " + result + " " + unitOutput;
    }

    // Conversion methods
    private static double secondsToMinutes(double seconds) {
        return seconds / 60;
    }

    private static double secondsToHours(double seconds) {
        return seconds / 3600;
    }

    private static double secondsToDays(double seconds) {
        return seconds / 86400;
    }

    private static double secondsToWeeks(double seconds) {
        return seconds / 604800;
    }

    private static double secondsToYears(double seconds) {
        return seconds / 31536000;
    }

    private static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }

    private static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    private static double minutesToDays(double minutes) {
        return minutes / 1440;
    }

    private static double minutesToWeeks(double minutes) {
        return minutes / 10080;
    }

    private static double minutesToYears(double minutes) {
        return minutes / 525600;
    }

    private static double hoursToSeconds(double hours) {
        return hours * 3600;
    }

    private static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    private static double hoursToDays(double hours) {
        return hours / 24;
    }

    private static double hoursToWeeks(double hours) {
        return hours / 168;
    }

    private static double hoursToYears(double hours) {
        return hours / 8760;
    }

    private static double daysToSeconds(double days) {
        return days * 86400;
    }

    private static double daysToMinutes(double days) {
        return days * 1440;
    }

    private static double daysToHours(double days) {
        return days * 24;
    }

    private static double daysToWeeks(double days) {
        return days / 7;
    }

    private static double daysToYears(double days) {
        return days / 365.25;
    }

    private static double weeksToSeconds(double weeks) {
        return weeks * 604800;
    }

    private static double weeksToMinutes(double weeks) {
        return weeks * 10080;
    }

    private static double weeksToHours(double weeks) {
        return weeks * 168;
    }

    private static double weeksToDays(double weeks) {
        return weeks * 7;
    }

    private static double weeksToYears(double weeks) {
        return weeks / 52.1775;
    }

    private static double yearsToSeconds(double years) {
        return years * 31536000;
    }

    private static double yearsToMinutes(double years) {
        return years * 525600;
    }

    private static double yearsToHours(double years) {
        return years * 8760;
    }

    private static double yearsToDays(double years) {
        return years * 365.25;
    }

    private static double yearsToWeeks(double years) {
        return years * 52.1775;
    }

}
