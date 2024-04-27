package ua.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* 
Прогалини
*/

public class Solution {
    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] buffer;

        try {
            fis = new FileInputStream(args[0]);
            buffer = new byte[fis.available()];
            fis.read(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int countSpace = 0;
        for (Byte item : buffer) {
            if (item.intValue() == 32)
                countSpace++;
        }
        int countAllSymbols = buffer.length;
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        double ratio = (double) countSpace / countAllSymbols * 100;
        double result = (double) Math.round(ratio * 100) / 100;
        System.out.println(result);
    }
}