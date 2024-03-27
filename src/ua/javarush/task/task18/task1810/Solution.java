package ua.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        boolean isSmallFile = false;
        Scanner scanner = new Scanner(System.in);
        String fileName;
        byte[] array;
        FileInputStream fis = null;

        try {
            while (!isSmallFile) {
                fileName = scanner.nextLine();
                fis = new FileInputStream(fileName);
                if (fis.available() < 1000)
                    isSmallFile = true;
                array = new  byte[fis.available()];
                fis.read(array);
            }
            scanner.close();
            fis.close();
            throw new DownloadException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class DownloadException extends Exception {

    }
}
