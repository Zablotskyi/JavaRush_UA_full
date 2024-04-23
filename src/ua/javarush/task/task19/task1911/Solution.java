package ua.javarush.task.task19.task1911;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Рідер обгортка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запам'ятовуємо справжній PrintStream у спеціальну змінну
        PrintStream consoleStream = System.out;
        //Створюємо динамічний масив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //Створюємо адаптер до класу PrintStream
        PrintStream stream = new PrintStream(outputStream);

        //Встановлюємо його як поточний System.out
        System.setOut(stream);
        //Викликаємо функцію, яка нічого не знає про наші маніпуляції
        testString.printSomething();

        //Перетворюємо записані в наш ByteArray дані в рядок
        String result = outputStream.toString();

        //Повертаємо все як було
        System.setOut(consoleStream);

        //Переводимо всі літери у верхній регістр
        StringBuilder stringBuilder = new StringBuilder(result);
        String newString = result.toUpperCase();

        //виводимо в консоль
        System.out.println(newString);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}