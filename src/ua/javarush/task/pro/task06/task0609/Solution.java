package ua.javarush.task.pro.task06.task0609;

/* 
Кубічний калькулятор у кубі
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long l) {
        return cube(cube(l));
    }

    //напишіть тут ваш код
}
