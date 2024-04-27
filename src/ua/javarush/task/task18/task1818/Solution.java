package ua.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одному
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream  fisSecondFile = null;
        FileInputStream  fisThirdFile = null;
        FileOutputStream fos = null;
        byte[] buffer = null;

        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        String thirdFileName = scanner.nextLine();

        try {
            fos = new FileOutputStream(firstFileName, true);
            fisSecondFile = new FileInputStream(secondFileName);
            buffer = new byte[fisSecondFile.available()];
            fisSecondFile.read(buffer);
            fos.write(buffer);
            fisThirdFile = new FileInputStream(thirdFileName);
            buffer = new byte[fisThirdFile.available()];
            fisThirdFile.read(buffer);
            fos.write(buffer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (fisSecondFile != null && fisThirdFile != null && fos != null && scanner != null) {
            try {
                fisSecondFile.close();
                fisThirdFile.close();
                fos.close();
                scanner.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}