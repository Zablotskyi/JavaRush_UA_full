package ua.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/* 
Максимальний байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();
        FileInputStream fis = new FileInputStream(fileName);

        byte[] array = new byte[fis.available()];
        fis.read(array);
        Arrays.sort(array);

        if (scanner != null && fis != null) {
            fis.close();
            scanner.close();
        }
        System.out.println(array[array.length - 1]);
    }
}