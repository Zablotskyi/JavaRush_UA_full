package ua.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файлу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] array;
        try {
            fis = new FileInputStream(firstFileName);
            fos = new FileOutputStream(secondFileName);
            array = new byte[fis.available()];
            fis.read(array);
            for (int i = array.length - 1; i >= 0; i--) {
                fos.write(array[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (scanner != null && fis != null && fos != null) {
                scanner.close();
                try {
                    fis.close();
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}