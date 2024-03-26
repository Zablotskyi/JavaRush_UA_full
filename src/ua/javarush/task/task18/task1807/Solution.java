package ua.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Підрахунок ком.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fis = null;
        byte[] array;

        try {
            fis = new FileInputStream(fileName);
            array = new byte[fis.available()];
            fis.read(array);
            int count = 0;
            for (Byte item : array) {
                if (item == 44)
                    count++;
            }
            System.out.println(count);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null && fis != null) {
                scanner.close();
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}