package com.company.utils;

public class Utility {
    public static char showLetterInAlphabet(int order) {
//        if(order < 1) {
//            order = 1;
//        }
//        else if(order > 25) {
//            order = 25;
//        }
//        else
//            order = order;
        return (char) ('A' + ((order < 1) ? 1 : (order > 25 ? 25 : order)) - 1);
    }

    public static String showNumbers(int upperLimit, int spaces) {
        String toShow = "";
        for (int i = 1; i <= upperLimit; i++) {
            toShow += putSpaces(spaces) + i + putSpaces(spaces);
        }
        return toShow;
    }

    public static String putSpaces(int numberOfSpaces) {
        String spaces = "";
        for (int i = 0; i < numberOfSpaces; i++) {
            spaces += " ";
        }
        return spaces;
    }
}
