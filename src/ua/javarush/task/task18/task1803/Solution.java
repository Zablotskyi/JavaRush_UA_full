package ua.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

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

        while (fis.available() > 0) {
            array[fis.read()]++;
        }
        Arrays.sort(array);
        System.out.print((char) array[array.length - 1]);

        if (scanner != null && fis != null) {
            scanner.close();
            fis.close();
        }
    }
}