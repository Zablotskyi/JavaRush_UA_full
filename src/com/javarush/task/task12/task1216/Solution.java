package com.javarush.task.task12.task1216;

/* 
Летать охота
*/

public class Solution {
    public static void main(String[] args) {
        
    }

    //add an interface here - добавь интерфейс тут
    public interface CanFly {
        static void can() {
            System.out.print("Хочу ");
        }

        static void fly() {
            System.out.println("літати!");
        }
    }

}
