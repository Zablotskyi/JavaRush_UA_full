package ua.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортування байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fis = new FileInputStream(fileName);
        Set<Byte> byteSet = new HashSet<>();
        byte[] array = new byte[fis.available()];
        List<Byte> tmpList;

        fis.read(array);
        for (Byte item : array) {
            byteSet.add(item);
        }

        tmpList = byteSet.stream().collect(Collectors.toList());
        Collections.sort(tmpList);

        for (Byte item : tmpList)
            System.out.print(item + " ");

        if (scanner != null && fis != null) {
            scanner.close();
            fis.close();
        }
    }
}