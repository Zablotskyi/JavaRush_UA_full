package ua.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Найчастіші байти
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fis = new FileInputStream(fileName);
        byte[] array = new byte[fis.available()];

        fis.read(array);
        byte[] tmpArray = array;


    }
}