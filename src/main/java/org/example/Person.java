package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private int age;
    private double height;    // added instance variable
    private double weight;    // added instance variable
    private String email;     // added instance variable

    // Constructor for firstname, lastName, age
    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    // Overloaded constructor chaining to first and initializing extras
    public Person(String firstname, String lastName, int age,
                  double height, double weight, String email) {
        this(firstname, lastName, age);
        this.height = height;
        this.weight = weight;
        this.email = email;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}