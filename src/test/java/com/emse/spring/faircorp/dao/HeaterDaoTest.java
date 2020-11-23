package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import com.emse.spring.faircorp.model.HeaterStatus;
import com.emse.spring.faircorp.model.Window;
import com.emse.spring.faircorp.model.WindowStatus;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class HeaterDaoTest {
    @Autowired
    private HeaterDao heaterDao;

    @Test
    public void shouldFindAHeater() {
        Heater heater = heaterDao.getOne(-10L);
        Assertions.assertThat(heater.getName()).isEqualTo("Heater1");
        Assertions.assertThat(heater.getHeaterStatus()).isEqualTo(HeaterStatus.ON);
    }

    @Test
    public void shouldFindRoomOnHeaters() {
        List<Heater> result = heaterDao.findRoomOnHeaters(-10L);
        Assertions.assertThat(result)
                .hasSize(2)
                .extracting("id", "heaterStatus")
                .contains(Tuple.tuple(-10L, HeaterStatus.ON))
                .contains(Tuple.tuple(-9L, HeaterStatus.ON));
    }

    @Test
    public void shouldNotFindRoomOnHeaters() {
        List<Heater> result = heaterDao.findRoomOnHeaters(-9L);
        Assertions.assertThat(result).isEmpty();
    }

    @Test
    public void shouldDeleteTwoHeaters() {
        Integer del = heaterDao.deleteHeaterByRoom(-10L);
        Assertions.assertThat(del).isEqualTo(2);
    }

    @Test
    public void shouldDeleteNoHeater() {
        Integer del = heaterDao.deleteHeaterByRoom(-9L);
        Assertions.assertThat(del).isEqualTo(0);
    }
}