package ua.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Зустрічаємо символи
*/

public class Solution {
    public static void main(String[] args) {
        FileInputStream fis = null;
        Map<Integer, Integer> symbols = new TreeMap<>();
        try {
            fis = new FileInputStream(args[0]);
            int[] buffer = new int[256];
            while (fis.available() > 0) {
                buffer[fis.read()] ++;
            }
            for (int i = 0; i < buffer.length; i++) {
                symbols.put(i, buffer[i]);
            }
            for (Map.Entry<Integer, Integer> entry : symbols.entrySet()) {
                char symbol = Character.forDigit(entry.getKey(), 10);
                if (entry.getValue() != 0)
                System.out.println(symbol + " " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}