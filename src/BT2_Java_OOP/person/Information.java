package BT2_Java_OOP.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Phương", 26, "Nam", "Hà Nội", "0985746546");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
        System.out.println("Address: " + person.address);
        System.out.println("Phone: " + person.phone);
    }
}
