INSERT INTO BUILDING(id, name) VALUES(-9, 'Building 1 - No rooms');
INSERT INTO BUILDING(id, name) VALUES(-10, 'Building 2');

INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-10, 'Room1', 1, 22.3, 20.0, -10);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-9, 'Room2', 1, 18.2, 20.0, -10);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-8, 'Room3', 2, 19.2, 21.0, -10);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-7, 'Room4', 2, 16.3, 21.0, -10);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-6, 'Room5', 2, 16.5, 21.0, -10);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-5, 'Room6', 3, 15.4, 20.2, -10);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id) VALUES(-4, 'Room6', 3, 15.8, 20.2, -10);

INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-10, 'ON', 'Heater1', 2000, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-9, 'ON', 'Heater2', 1500, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-8, 'ON', 'Heater3', 2000, -9);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-7, 'ON', 'Heater4', 1500, -9);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-6, 'ON', 'Heater5', 750, -8);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-5, 'ON', 'Heater6', 2500, -8);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-4, 'ON', 'Heater7', 1000, -7);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-3, 'ON', 'Heater8', 250, -7);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-2, 'ON', 'Heater9', 1500, -6);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-1, 'ON', 'Heater10', 2000, -6);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(1, 'ON', 'Heater11', 2000, -5);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(2, 'ON', 'Heater12', 1000, -5);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(3, 'ON', 'Heater13', 1000, -4);


INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-10, 'CLOSED', 'Window 1', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-9, 'OPEN', 'Window 2', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-8, 'CLOSED', 'Window 3', -9);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-7, 'OPEN', 'Window 4', -9);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-6, 'CLOSED', 'Window 5', -8);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-5, 'CLOSED', 'Window 6', -8);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-4, 'OPEN', 'Window 7', -7);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-3, 'CLOSED', 'Window 8', -7);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-2, 'CLOSED', 'Window 9', -6);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-1, 'CLOSED', 'Window 10', -6);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(1, 'CLOSED', 'Window 11', -5);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(2, 'CLOSED', 'Window 12', -5);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(3, 'OPEN', 'Window 13', -4);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(4, 'CLOSED', 'Window 14', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(5, 'CLOSED', 'Window 15', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(6, 'OPEN', 'Window 16', -9);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(7, 'CLOSED', 'Window 17', -9);

