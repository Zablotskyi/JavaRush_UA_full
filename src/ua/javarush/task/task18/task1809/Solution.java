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
        byte[] array
        try {
            array = new byte[fis.available()];
            fis = new FileInputStream(firstFileName);
            fos = new FileOutputStream(secondFileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
