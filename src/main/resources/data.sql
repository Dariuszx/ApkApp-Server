INSERT INTO app_role (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standardowy użytkownik');
INSERT INTO app_role (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin');

INSERT INTO user (id, password, username, coin) VALUES (1, '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'batman', 0);
INSERT INTO user (id, password, username, coin) VALUES (2, '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin', 0);


INSERT INTO user_role(user_id, role_id) VALUES(1,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,1);
INSERT INTO user_role(user_id, role_id) VALUES(2,2);