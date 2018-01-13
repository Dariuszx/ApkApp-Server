INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standardowy użytkownik');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin');

INSERT INTO user (id, password, username, coin) VALUES (1, '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'batman', 0);
INSERT INTO user (id, password, username, coin) VALUES (2, '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin', 0);


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);

INSERT INTO localization(id, latitude, longitude) VALUES (1, 52.222126849999995, 21.007019800000002);
INSERT INTO localization(id, latitude, longitude) VALUES (2, 52.2220477, 21.00675855);
INSERT INTO localization(id, latitude, longitude) VALUES (3, 52.222134499999996, 21.00675845);
INSERT INTO localization(id, latitude, longitude) VALUES (4, 52.2222205, 21.00675835);

INSERT INTO localization(id, latitude, longitude) VALUES (5, 52.22234245, 21.00675825);
INSERT INTO localization(id, latitude, longitude) VALUES (6, 52.22214675, 21.006977900000003);
INSERT INTO localization(id, latitude, longitude) VALUES (7, 52.222213999999994, 21.0069779);
INSERT INTO localization(id, latitude, longitude) VALUES (8, 52.221959049999995, 21.00675895);
INSERT INTO localization(id, latitude, longitude) VALUES (9, 52.22208355, 21.00682405);


INSERT INTO item(id, value, visibility, name, localization_id) VALUES (1, 1, true, 'FLOOR-II', 1);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (2, 1, true, 'ROOM-212', 2);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (3, 1, true, 'ROOM-213', 3);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (4, 1, true, 'ROOM-214', 4);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (5, 1, true, 'ROOM-216', 5);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (6, 1, true, 'Stairs', 6);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (7, 1, true, 'Elevator', 7);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (8, 1, true, 'ROOM-211', 8);
INSERT INTO item(id, value, visibility, name, localization_id) VALUES (9, 1, true, 'Corridor', 9);

INSERT INTO quest(id, image_name, name, value, localization_id) VALUES (1, 'test', 'Lorem ipsum', 10, 5);
INSERT INTO quest(id, image_name, name, value, localization_id) VALUES (2, 'image', 'Dolor mit amet', 10, 6);