INSERT INTO alumnos (nombre,apellido,edad) VALUES('Maria Luz','Poveda',55);
INSERT INTO alumnos (nombre,apellido,edad) VALUES('Javier','Poveda',52);
INSERT INTO alumnos (nombre,apellido,edad)VALUES('Elena','Poveda',50);

INSERT INTO usuarios (enabled, password, username) VALUES(1,'$2a$10$FQyl7zwMz3h702VjwhTGEeXQsr1evwqghqdUpgoNIPptKRso13kli','Patricia');
INSERT INTO usuarios (enabled, password, username) VALUES(1,'$2a$10$Cnrf9bkaTeDkreJJASHwM.GRvNmeMhsYU/VDhw6GY/QlqoyVeEeGa','admin');


INSERT INTO roles (nombre) VALUES('ROLE_USER');
INSERT INTO roles (nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);
