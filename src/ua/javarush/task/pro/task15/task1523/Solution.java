package ua.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

/* 
Отримання інформації через API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишіть тут ваш код
        URLConnection connection = url.openConnection();

        connection.setDoOutput(true);
        OutputStream outputStream = connection.getOutputStream();
        outputStream.write(1);

        InputStream inputStream = connection.getInputStream();
        byte[] buffer = inputStream.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}