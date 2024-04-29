package ua.javarush.task.task18.task1819;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
Об'єднання файлів
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileInputStream fisFirsFile = null;
        FileInputStream fisSecondFile = null;
        FileOutputStream fos = null;
        byte[] bufferFirst;
        byte[] bufferSecond;
        byte[] bufferResult;

        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();

        try {
            fisFirsFile = new FileInputStream(firstFileName);
            fisSecondFile = new FileInputStream(secondFileName);
            bufferFirst = new byte[fisFirsFile.available()];
            fisFirsFile.read(bufferFirst);
            bufferSecond = new byte[fisSecondFile.available()];
            fisSecondFile.read(bufferSecond);
            bufferResult = new byte[bufferFirst.length + bufferSecond.length];
            fos = new FileOutputStream(firstFileName);

            System.arraycopy(bufferSecond, 0, bufferResult, 0, bufferSecond.length);
            System.arraycopy(bufferFirst, 0, bufferResult, bufferSecond.length, bufferFirst.length);

            fos.write(bufferResult);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (fisFirsFile != null && fisSecondFile != null && fos != null && scanner != null) {
            try {
                fisFirsFile.close();
                fisSecondFile.close();
                fos.close();
                scanner.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}