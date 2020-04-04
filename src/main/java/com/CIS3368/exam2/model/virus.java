package com.CIS3368.exam2.model;

import javax.persistence.*;

//In the model package I set up the class for the attributes I would need about a virus.
@Entity(name = "virus_table")
public class virus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //randomly generates an id
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "symptoms")
    private String symptoms;
    @Column(name = "duration")
    private int duration;
    @Column(name = "mortalityrate")
    private double mortalityrate;
    @Column(name = "imageaddress")
    private String imageaddress;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getMortalityrate() {
        return mortalityrate;
    }

    public void setMortalityrate(double mortalityrate) {
        this.mortalityrate = mortalityrate;
    }

    public String getImageaddress() {
        return imageaddress;
    }

    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }
}
