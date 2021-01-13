package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class RoomDaoCustomImpl implements RoomDaoCustom {

    @PersistenceContext
    private EntityManager em;

    public Integer deleteWindowByRoom(Long id) {
        String jpql = "DELETE FROM Window w WHERE w.room.id = :id";
        Query query = em.createQuery(jpql);
        Integer del = query.setParameter("id", id).executeUpdate();
        return del;
    }

    public Integer deleteHeaterByRoom(Long id) {
        String jpql = "DELETE FROM Heater h WHERE h.room.id = :id";
        Query query = em.createQuery(jpql);
        Integer del = query.setParameter("id", id).executeUpdate();
        return del;
    }

    @Override
    public List<Room> findRoomUnder() {
        String jpql = "select r from Room r where r.currentTemperature < r.targetTemperature";
        return em.createQuery(jpql, Room.class)
                .getResultList();
    }

    @Override
    public List<Room> findRoomOver() {
        String jpql = "select r from Room r where r.currentTemperature > r.targetTemperature";
        return em.createQuery(jpql, Room.class)
                .getResultList();
    }
}