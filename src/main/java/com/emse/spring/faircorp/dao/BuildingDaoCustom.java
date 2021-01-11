package com.emse.spring.faircorp.dao;


import com.emse.spring.faircorp.model.Building;

public interface BuildingDaoCustom {
    Integer deleteWindowByRoom(Long id);

    Integer deleteHeaterByRoom(Long id);

    Integer deleteRoomByBuilding(Long id);
}