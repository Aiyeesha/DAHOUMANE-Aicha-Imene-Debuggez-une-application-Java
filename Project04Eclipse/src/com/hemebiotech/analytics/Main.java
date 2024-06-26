package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/**
 * Run the program
 */

public class Main {

    /**
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {

        /*
        Read symptoms.txt and return list
         */
        ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile(new File("Project04Eclipse/Ressources/Symptoms.txt"));
        List<String> symptoms = readSymptoms.getSymptoms();

        /*
        Sorts in alphabetical order and counts the occurrences of the symptoms in the list
         */
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        Map<String, Integer> countSymptoms = analyticsCounter.countSymptoms(symptoms);

        /*
        Print result in the results.out file
         */
        File fileOut = new File("Results.out");
        analyticsCounter.writeSymptoms(countSymptoms, fileOut);

    }

}
