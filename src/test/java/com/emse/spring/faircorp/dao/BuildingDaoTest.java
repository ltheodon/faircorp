package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Building;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class BuildingDaoTest {
    @Autowired
    private BuildingDao buildingDao;

    @Test
    public void shouldFindABuildingByID() {
        Building building = buildingDao.getOne(-10L);
        Assertions.assertThat(building.getName()).isEqualTo("Building 2");
    }

    @Test
    public void shouldFindABuildingByName() {
        Building building = buildingDao.findByName("Building 2");
        Assertions.assertThat(building.getName()).isEqualTo("Building 2");
    }
}