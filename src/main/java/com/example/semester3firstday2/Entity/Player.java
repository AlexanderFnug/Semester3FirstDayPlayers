package com.example.semester3firstday2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Lombok Annotations
@Getter
@Setter
@NoArgsConstructor

//Styrer databasen
@Entity
@Table(name="spiller")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="player_name", length= 70, nullable = false)
    String name;

    String country;
    String position;

    public Player(String name, String country, String position) {
        this.name = name;
        this.country = country;
        this.position = position;
    }
}