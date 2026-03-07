package com.csc340.crud_api;
import jakarta.persistence.*;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long characterId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    private String role;
    private String universe;

    public Student() {}

    public Student(String name, String description, String role, String universe) {
        this.name = name;
        this.description = description;
        this.role = role;
        this.universe = universe;
    }

    public long getCharacterId() {
        return characterId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    } 
}
