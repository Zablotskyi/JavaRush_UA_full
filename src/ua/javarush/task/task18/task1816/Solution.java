package ua.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Англійські літери
*/

public class Solution {

    public static void main(String[] args) {
        FileInputStream fis = null;
        byte[] buffer;

        try {
            fis = new FileInputStream(args[0]);
            buffer = new byte[fis.available()];
            fis.read(buffer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;
        for (Byte item : buffer) {
            if (item.intValue() >= 65 && item.intValue() <= 90 || item.intValue() >= 97 && item.intValue() <= 122)
                count++;
        }
        System.out.println(count);
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}