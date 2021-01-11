package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.dao.BuildingDao;
import com.emse.spring.faircorp.model.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@CrossOrigin
@RestController // (1)
@RequestMapping("/api/buildings") // (2)
@Transactional // (3)
public class BuildingController {

    private final BuildingDao buildingDao;

    public BuildingController(BuildingDao buildingDao) { // (4)
        this.buildingDao = buildingDao;
    }

    @GetMapping // (5)
    public List<BuildingDto> findAll() {
        return buildingDao.findAll().stream().map(BuildingDto::new).collect(Collectors.toList());  // (6)
    }

    @GetMapping(path = "/{id}")
    public BuildingDto findById(@PathVariable Long id) {
        return buildingDao.findById(id).map(BuildingDto::new).orElse(null); // (7)
    }

    @PostMapping // (8)
    public BuildingDto create(@RequestBody BuildingDto dto) {
        // BuildingDto must always contain the Building Building

        Building building = null;
        // On creation id is not defined
        if (dto.getId() == null) {
            building = buildingDao.save(new Building(dto.getName()));
        }
        else {
            try {
                building = buildingDao.getOne(dto.getId());  // (9)
            }catch(Exception e) {
                System.out.print("Identifiant inexistant!\n");
            }
        }
        return new BuildingDto(building);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        Building building = buildingDao.findById(id).orElseThrow(IllegalArgumentException::new);
        Set<Room> rooms = building.getRooms();
        for (Room room : rooms) {
            buildingDao.deleteHeaterByRoom(room.getId());
            buildingDao.deleteWindowByRoom(room.getId());
        }
        buildingDao.deleteRoomByBuilding(id);
        buildingDao.deleteById(id);
    }
}