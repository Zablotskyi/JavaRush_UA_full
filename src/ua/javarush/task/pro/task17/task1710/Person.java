package ua.javarush.task.pro.task17.task1710;

/* 
Від абстракції до реальності
*/

public class Person {
    private String name;
    private int age;

//    public abstract String getName();
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public abstract void setAge(int age);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
