package ua.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файли та винятки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        FileInputStream fis = null;
        while (scanner.hasNext()) {
            fileName = scanner.nextLine();
            try {
                fis = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                Thread.currentThread().stop();
            }
        }
        if (scanner != null && fis != null) {
            try {
                scanner.close();
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}