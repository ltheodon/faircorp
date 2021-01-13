package com.emse.spring.faircorp.dao;


import com.emse.spring.faircorp.model.Room;

import java.util.Collection;
import java.util.List;

public interface RoomDaoCustom {
    Integer deleteWindowByRoom(Long id);
    Integer deleteHeaterByRoom(Long id);

    List<Room> findRoomUnder();
    List<Room> findRoomOver();
}