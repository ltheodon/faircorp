package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Room;

import java.util.Set;

public class BuildingDto {
    private Long id;
    private String name;

    public BuildingDto() {
    }

    public BuildingDto(Building Building) {
        this.id = Building.getId();
        this.name = Building.getName();
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
}