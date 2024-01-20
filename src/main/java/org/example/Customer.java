package org.example;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "mycust")

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(length = 15,unique = false,updatable = true,nullable = false)
    private String Name;
    @Column(name = "cEmail",length = 30,unique = true,updatable = false,nullable = true)
    private String Email;
    @Column(name = "cPhone",unique = true,updatable = false,nullable = true)

    private int  phone;

    public Customer()
    {

    }
    public Customer(String name, String email, int phone) {
        Name = name;
        Email = email;
        this.phone = phone;
    }
    public Customer(int id, String name, String email, int phone) {
        this.id = id;
        Name = name;
        Email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
