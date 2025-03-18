package Lectures.Chapter.Chapter_4;

class Person {
    public String name;
    public int age;

    public Person() {
    }

    public void speak() {
        System.out.println("My name is " + name + ". I am " + age + " years old.");
    }
}

public class People {
    public static void main(String[] args) {

        Person person = new Person();

        person.name = "John";
        person.age = 25;

        person.speak();
    }
}