package BT2_Java_OOP.person;

public class Person {
    protected String name;
    protected int age;
    protected String gender;
    String address;
    String phone;

    public Person() {

    }

    protected void getInfo(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }

    Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
}
