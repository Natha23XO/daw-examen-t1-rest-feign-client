CREATE DATABASE  IF NOT EXISTS `DawT1`;
USE `DawT1`;
CREATE TABLE cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    direccion VARCHAR(150) NOT NULL
);

INSERT INTO cliente (nombre, apellido, email, telefono, direccion) VALUES 
('Juan', 'Pérez', 'juan.perez@example.com', '987654321', 'Calle Falsa 123, Lima'),
('Ana', 'García', 'ana.garcia@example.com', '987654322', 'Av. Los Álamos 456, Arequipa'),
('Carlos', 'Ramírez', 'carlos.ramirez@example.com', '987654323', 'Jr. Las Flores 789, Cusco'),
('María', 'Fernández', 'maria.fernandez@example.com', '987654324', 'Calle Los Olivos 321, Trujillo');


CREATE TABLE empleado (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    puesto VARCHAR(50) NOT NULL
);

INSERT INTO empleado (nombre, apellido, puesto) VALUES 
('Hugo Nathanael', 'Castro Leon', 'Desarrollador Web'),
('Patrick', 'Montes', 'Ingeniero de Datos'),
('Genesis', 'Despoux Arica', 'Analista');



