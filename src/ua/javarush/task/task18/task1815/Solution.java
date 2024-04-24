package ua.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблиця
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface tableInterface = new TableInterface() {
            @Override
            public void setModel(List rows) {
                System.out.println(rows.size());
            }

            @Override
            public String getHeaderText() {
                return "";
            }

            @Override
            public void setHeaderText(String newHeaderText) {

            }
        };

        @Override
        public void setModel(List rows) {

        }

        @Override
        public String getHeaderText() {
            return "";
        }

        @Override
        public void setHeaderText(String newHeaderText) {

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}