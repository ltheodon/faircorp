package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class RoomDaoTest {
    @Autowired
    private RoomDao roomDao;

    @Test
    public void shouldFindARoomByID() {
        Room room = roomDao.getOne(-10L);
        Assertions.assertThat(room.getName()).isEqualTo("Room1");
        Assertions.assertThat(room.getFloor()).isEqualTo(1);
    }

    @Test
    public void shouldFindARoomByName() {
        Room room = roomDao.findByName("Room1");
        Assertions.assertThat(room.getName()).isEqualTo("Room1");
        Assertions.assertThat(room.getFloor()).isEqualTo(1);
    }
}