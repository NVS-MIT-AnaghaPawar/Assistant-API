package com.example.api.hirademyassistantapi;

import jakarta.persistence.*;

@Entity
@Table
public class Assistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //automatically id will be created
    private int id;
    @Column
    private String name;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private int salary;
    @Column
    private String city;
    @Column
    private String country;
    @Column
    private String department;
    @Column
    private String role;
    public Assistant() {

    }
    //Constructor

    public Assistant(int id, String name, String mobile, String email, int salary, String city, String country, String department, String role) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.salary = salary;
        this.city = city;
        this.country = country;
        this.department = department;
        this.role = role;
    }

    //Getter and Setter method
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", department='" + department + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

