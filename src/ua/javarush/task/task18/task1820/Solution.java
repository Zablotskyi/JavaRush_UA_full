package ua.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

/* 
Округлення чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer;
        BufferedReader reader;
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        try {
            File file = new File(firstFileName);
            writer = new PrintWriter(secondFileName);
            reader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String item : words) {
                    double number = Double.parseDouble(item);
                    writer.print(Math.round(number) + " ");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (scanner != null && writer != null && reader != null) {
            try {
                scanner.close();
                writer.close();
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}