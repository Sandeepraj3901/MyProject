package org.example.newspring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SoftwareEngineer {
    @Id
    public int id;
    public String name;
    public int age;
    public String address;
    public String stack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(int id, String name, int age, String address, String stack) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.stack = stack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }
}
