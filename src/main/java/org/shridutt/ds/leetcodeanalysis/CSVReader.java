package org.shridutt.ds.leetcodeanalysis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * CSV data is taken from : https://github.com/doocs/leetcode/blob/main/solution/README_EN.md
 */
public class CSVReader {
    public static void main(String[] args) {
        List<Record> records = new ArrayList<>();

        // Load the file from resources folder
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                CSVReader.class.getClassLoader().getResourceAsStream("data.csv")))) {

            String line;

            // Skip the header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s*\\|\\s*");

                if (parts.length == 6) {
                    records.add(new Record(
                            parts[1], // #
                            parts[2], // Solution
                            parts[3], // Tags
                            parts[4], // Difficulty
                            parts[5]  // Remark
                    ));
                }
            }
        } catch (IOException |
                 NullPointerException e) {
            e.printStackTrace();
        }

        // Print records to verify
        //records.forEach(System.out::println);


        Map<String, List<String>> analyzedData = new HashMap<>();
        for (Record eachRecord : records) {
            for (String tag : eachRecord.getTags()) {
                analyzedData.computeIfAbsent(tag, k -> new ArrayList<>())
                        .add(eachRecord.getSolution());
            }
        }


        analyzedData.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())) // Sort by list size
                .forEach(entry ->
                        System.out.println(entry.getKey() + ": " + entry.getValue().size())
                );


    }
}

