package ua.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифрування
*/

public class Solution {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] buffer;

        try {
            fis = new FileInputStream(args[1]);
            fos = new FileOutputStream(args[2]);
            buffer = new byte[fis.available()];

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        switch (args[0]) {
            case "-e": {
                try {
                    fis.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    fos.write(fileEncryption(buffer));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
            case "-d": {
                try {
                    fis.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                try {
                    fos.write(fileDecryption(buffer));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
        if (fis != null && fos != null) {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // метод для шифрування файлу
    public static byte[] fileEncryption(byte[] array) {
        byte[] newArray = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (byte) (array[i] + 1);
        }
        return newArray;
    }

    // метод для розшифрування файлу
    public static byte[] fileDecryption(byte[] array) {
        byte[] newArray = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = (byte) (array[i] - 1);
        }
        return newArray;
    }
}