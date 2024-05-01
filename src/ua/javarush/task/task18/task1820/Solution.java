package ua.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/* 
Округлення чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        try {
            File file = new File(firstFileName);
            FileOutputStream fos = new FileOutputStream(secondFileName);
            Scanner readNumbers = new Scanner(file);

            while (readNumbers.hasNextDouble()) {
                double number = readNumbers.nextDouble();
                System.out.println(number);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
