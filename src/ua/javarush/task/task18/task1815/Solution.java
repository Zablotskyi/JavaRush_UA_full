package ua.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблиця
*/

public class Solution {
    public class TableInterfaceWrapper {

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}