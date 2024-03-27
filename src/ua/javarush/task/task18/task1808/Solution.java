package ua.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Поділ файлу
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstFileName = scanner.nextLine();
        String secondFileName = scanner.nextLine();
        String thirdFileName = scanner.nextLine();
        FileInputStream fis = null;
        FileOutputStream fosSecondFile = null;
        FileOutputStream fosThirdFile = null;
        try {
            fis = new FileInputStream(firstFileName);
            fosSecondFile = new FileOutputStream(secondFileName);
            fosThirdFile = new FileOutputStream(thirdFileName);
            byte[] array = new byte[fis.available()];
            fis.read(array);
            int begin = 0;
            int middle = array.length / 2;
            int end = array.length;

            if (array.length % 2 == 0) {
                fosSecondFile.write(array, begin, middle);
                fosThirdFile.write(array, middle, end - middle);
            } else if (array.length % 2 != 0) {
                fosSecondFile.write(array, begin, middle + 1);
                fosThirdFile.write(array, middle + 1, end - middle - 1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
            try {
                fis.close();
                fosSecondFile.close();
                fosThirdFile.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}