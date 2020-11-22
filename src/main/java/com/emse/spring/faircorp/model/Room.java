package com.emse.spring.faircorp.model;

import com.sun.istack.NotNull;
import javax.persistence.Id;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id// (3)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull
    private Integer floor;

    @NotNull
    private String name;

    private Double currentTemperature;
    private Double targetTemperature;

    @OneToMany(mappedBy = "room")
    private Set<Heater> heaters;

    @OneToMany(mappedBy = "room")
    private Set<Window> windows;

    public Room() {
    }

    public Room(String name, Integer floor) {
        this.name = name;
        this.floor = floor;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
