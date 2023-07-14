CREATE DATABASE lookUp;
USE lookUp;

CREATE TABLE usuarios (
id_usuario INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR (255) NOT NULL,
apellido VARCHAR (255) NOT NULL,
telefono VARCHAR(10) NOT NULL,
correo_electrónico VARCHAR (255) NOT NULL,
contrasena VARCHAR(8) NOT NULL
);

CREATE TABLE curso(
id_curso INT AUTO_INCREMENT PRIMARY KEY,
nombre_curso VARCHAR (255) NOT NULL, 
descripcion VARCHAR (255) NOT NULL
);

CREATE TABLE estado(
id_estado INT AUTO_INCREMENT PRIMARY KEY,
nombre_estado VARCHAR (255) NOT NULL
);

CREATE TABLE cursosVistos(
id_usuario INT,
id_curso INT,
id_estado INT,
FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario),
FOREIGN KEY (id_curso) REFERENCES curso (id_curso),
FOREIGN KEY (id_estado) REFERENCES estado (id_estado)
); 

CREATE TABLE publicaciones(
id_publicacion INT AUTO_INCREMENT PRIMARY KEY,
id_usuario INT,
tipo VARCHAR (255) NOT NULL,
contenido VARCHAR (255),
fecha_creacion datetime,
FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario)
);

CREATE TABLE videos(
id_video INT AUTO_INCREMENT PRIMARY KEY,
id_publicacion INT,
nombre_archivo VARCHAR (255),
ubicacion VARCHAR (255),
duracion TIME,
FOREIGN KEY (id_publicacion) REFERENCES publicaciones (id_publicacion)
);

CREATE TABLE imagenes(
id_imagen INT AUTO_INCREMENT PRIMARY KEY,
id_publicacion INT,
nombre_archivo VARCHAR(255),
ubicacion VARCHAR (255),
FOREIGN KEY (id_publicacion) REFERENCES publicaciones (id)
);


