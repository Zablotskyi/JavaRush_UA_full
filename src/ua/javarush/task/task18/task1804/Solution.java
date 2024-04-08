package ua.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.Arrays;
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
        for (int i = 0; i < 3; i++) {
            System.out.print(buffer[i] + " ");
        }

        if (scanner != null && fis != null) {
            scanner.close();
            fis.close();
        }
    }
}