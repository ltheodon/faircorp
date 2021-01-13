package com.emse.spring.faircorp.model;

import com.sun.istack.NotNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "HEATER")
public class Heater {
    @Id// (3)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    // (4)
    @Column(nullable = false)
    private String name;

    @Nullable
    private Long power;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Room room;

    // (5)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HeaterStatus heaterStatus;

    public Heater() {
    }

    public Heater(String name, HeaterStatus status, Room room, Long power) {
        this.heaterStatus = status;
        this.name = name;
        this.room = room;
        this.power = power;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getPower() {
        return this.power;
    }

    public void setPower(Long power) {
        this.id = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeaterStatus getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(HeaterStatus HeaterStatus) {
        this.heaterStatus = HeaterStatus;
    }
}
