package org.example;

public class Main {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Jane", "Smith", 17, 55.0, 165.0, "Female");

        // Output for person1
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        // Output for person2
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Weight: " + person2.getWeight());
        System.out.println("Height: " + person2.getHeightperson());  // Updated method call
        System.out.println("Gender: " + person2.getGender());
        System.out.println("Is Teen: " + person2.isTeen());

        // Creating a Wall object
        Wall wall = new Wall(5, 4);

        // Output the area
        System.out.println("area= " + wall.getArea());

        // Modify the height
        wall.setHeight(-1.5);

        // Output the width, height, and area
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
