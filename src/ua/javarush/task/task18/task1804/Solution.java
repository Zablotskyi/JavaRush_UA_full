package ua.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Найрідкісніші байти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[256];

        for (Byte item : buffer) {
            item = 0;
        }
        while (fis.available() > 0) {
            buffer[fis.read()]++;
        }

        Arrays.sort(buffer);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < buffer.length - 1; i++) {
            if (buffer[i] != 0) {
                resultList.add(i);
            }
        }
        for (int i = 0; i < resultList.size() - 1; i++) {
            if (resultList.get(i) == resultList.get(i + 1))
                System.out.print(resultList.get(i) + " " + resultList.get(i + 1));
        }

        if (scanner != null && fis != null) {
            scanner.close();
            fis.close();
        }
    }
}