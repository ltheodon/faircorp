package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

import static java.util.Collections.emptyList;

public class WindowDaoCustomImpl implements WindowDaoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Window> findRoomOpenWindows(Long id) {
        String jpql = "select w from Window w where w.room.id = :id and w.windowStatus= :status";
        return em.createQuery(jpql, Window.class)
                .setParameter("id", id)
                .setParameter("status", WindowStatus.OPEN)
                .getResultList();
    }

    @Override
    public Integer deleteWindowByRoom(Long id) {
        String jpql = "DELETE FROM Window w WHERE w.room.id = :id";
        Query query = em.createQuery(jpql);
        Integer del = query.setParameter("id", id).executeUpdate();
        return del;
    }

    @Override
    public List<Window> findByStatus(String windowStatus) {
        WindowStatus status;
        if (windowStatus.equals("OPEN")){
            status = WindowStatus.OPEN;
        }else if(windowStatus.equals("CLOSED")){
            status = WindowStatus.CLOSED;
        }else{
            List<Window> L = emptyList();
            return  L;
        }
        String jpql = "select w from Window w where w.windowStatus = :status";
        return em.createQuery(jpql, Window.class)
                .setParameter("status", status)
                .getResultList();
    }

    /*public Window save(Window window) {
        String jpql = "add w from Window w";
        Query query = em.createQuery(jpql);
        Integer del = query.executeUpdate();
        return window;
    }*/

}