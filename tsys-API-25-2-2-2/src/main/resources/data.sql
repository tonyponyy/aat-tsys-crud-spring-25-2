
CREATE TABLE departamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250),
    presupuesto INT
);
CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(250),
    apellidos VARCHAR(250),
    dni int,
    departamento INT,
    FOREIGN KEY (departamento) REFERENCES departamentos(id)
);
INSERT INTO departamentos (nombre,presupuesto) VALUES
    ('Derechos humanos',12000),
    ('Gestion recursos',12000),
    ('Alimentacion Cobayas',12000);
   
INSERT INTO empleados (dni,nombre,apellidos, departamento) VALUES
    (1231,'Daniel','Rodriguez',1),
    (56456,'Laura','Borgueres',1),
    (65678,'David','Renteres',2),
    (09890,'Miguel','Guacala',2);
