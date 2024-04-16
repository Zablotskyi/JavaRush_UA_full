package ua.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Найчастіші байти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fis = new FileInputStream(fileName);
        byte[] array = new byte[256];

        for (Byte item : array)
            item = 0;

        while (fis.available() > 0)
            array[fis.read()]++;

        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxCount)
                maxCount = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxCount)
                System.out.print(i + " ");
        }

        if (scanner != null && fis != null) {
            scanner.close();
            fis.close();
        }
    }
}