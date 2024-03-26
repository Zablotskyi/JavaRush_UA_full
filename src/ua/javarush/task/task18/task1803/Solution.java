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
        byte[] array = new byte[fis.available()];
        Map<Integer, Byte> setOfBytes = new HashMap<>();
        int count = 0;

        fis.read(array);
        for (int i = 0; i < array.length; i++) {
            if (setOfBytes.containsKey(array[i]))
                count++;
        }


        System.out.println();
        if (scanner != null && fis != null) {
            scanner.close();
            fis.close();
        }
    }
}