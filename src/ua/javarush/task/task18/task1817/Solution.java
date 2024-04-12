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
        int countAllSymbols = buffer.length - countSpace;
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        BigDecimal ratio = new BigDecimal(countSpace / countAllSymbols * 100);
        BigDecimal result = ratio.setScale(2, RoundingMode.HALF_UP);
        System.out.println(result);
    }
}