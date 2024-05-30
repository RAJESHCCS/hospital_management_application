package com.Hospital_management_application.hospital_managment_application.model;

public class User {


    private int userId;
    private String name;
    private int age;
    private int weight;
    private int shoeSize;
    private int waistSize;
    private int shirtSize;


    public User(int userId, String name, int age, int weight, int shoeSize, int waistSize, int shirtSize) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.shoeSize = shoeSize;
        this.waistSize = waistSize;
        this.shirtSize = shirtSize;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    public int getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(int shirtSize) {
        this.shirtSize = shirtSize;
    }



}
