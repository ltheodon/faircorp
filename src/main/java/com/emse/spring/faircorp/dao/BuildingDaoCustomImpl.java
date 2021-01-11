package com.emse.spring.faircorp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class BuildingDaoCustomImpl implements BuildingDaoCustom {

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
    public Integer deleteRoomByBuilding(Long id) {
        String jpql = "DELETE FROM Room r WHERE r.building.id = :id";
        Query query = em.createQuery(jpql);
        Integer del = query.setParameter("id", id).executeUpdate();
        return del;
    }
}