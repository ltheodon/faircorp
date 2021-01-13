package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.LongStream;

public interface WindowDaoCustom{
    List<Window> findRoomOpenWindows(Long id);

    Integer deleteWindowByRoom(Long room_id);

    List<Window> findByStatus(String windowStatus);
}