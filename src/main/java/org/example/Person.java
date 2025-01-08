package org.example;

public class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;
    private double weight;
    private double height;
    private String gender;

    // Constructor for firstName, lastName, and age
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloaded constructor with additional parameters
    public Person(String firstName, String lastName, int age, double weight, double height, String gender) {
        this(firstName, lastName, age);  // Constructor chaining
        this.weight = weight;
        this.height = height;
        this.gender = gender;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // Method is updated from getHeight to getHeightperson
    public double getHeightperson() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    // Method to check if the person is a teenager
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
