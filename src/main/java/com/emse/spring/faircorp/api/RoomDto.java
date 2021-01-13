package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;

import javax.persistence.OneToMany;
import java.util.Set;

public class RoomDto {
    private Long id;
    private Integer floor;
    private String name;
    private Double currentTemperature;
    private Double targetTemperature;
    private Set<Heater> heaters;
    private Set<Window> windows;

    public RoomDto() {
    }

    public RoomDto(Room Room) {
        this.id = Room.getId();
        this.floor = Room.getFloor();
        this.name = Room.getName();
        this.currentTemperature = Room.getCurrentTemperature();
        this.heaters = Room.getHeaters();
        this.windows = Room.getWindows();
    }

    public Long getId() {
        return id;
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


    public String getRoomName() {
        return name;
    }

    public void setRoomName(String roomName) {
        this.name = name;
    }

    public Long getRoomId() {
        return id;
    }

    public void setRoomId(Long roomId) {
        this.id = roomId;
    }

    public Integer getFloor() {
        return floor;
    }

}