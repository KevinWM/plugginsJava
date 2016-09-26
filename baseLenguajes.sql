create table centro(
nombre	varchar(50)
);


create table socio(
nombre		varchar(50),
direccion	varchar(500),
ciudad		varchar(50),
provincia	varchar(50),
telefono	varchar(20),
cuota		int,
cedula		varchar(50)
);

--drop table reserva
create table reserva(
horaInicio			varchar(50),
horaFin				varchar(50),
nombreInstalacion		varchar(50),
cedulaSocio			varchar(20),
fecha				date,
costo				int
);

--drop table reservaarticulo 
create table reservaArticulo(

cedulaSocio			varchar(20),
nombreArt			varchar(20),
tipoArt			varchar(20),
cantidad			int,
fecha				date,
costo				int
);

create table articulo(
tipo		varchar(50),
nombre		varchar(50),
cantidad	int
);

create table cancha(
caracteristicas		varchar(50),
nombre			varchar(50),
dimensiones		varchar(50),
tipo			varchar(50)
);

create table gym(
caracteristicas		varchar(50),
nombre			varchar(50),
dimensiones		varchar(50),
cantMaquinas		int
);

--drop table piscina
create table piscina(
caracteristicas		varchar(50),
nombre			varchar(50),
dimensiones		varchar(50),
profundidad		int,
carriles		int
);

create table pista(
caracteristicas		varchar(50),
nombre			varchar(50),
dimensiones		varchar(50),
carriles		int
);


insert into socio(nombre, cedula, telefono, provincia, ciudad, direccion, cuota) values ('Kevin Walsh', '201230456', '8123-5678', 'Alajuela', 'San Carlos', 'Santa Clara', 12000);
insert into socio(nombre, cedula, telefono, provincia, ciudad, direccion, cuota) values ('Jonathan Rojas', '201030456', '8123-5678', 'Alajuela', 'San Carlos', 'Penjamo', 12000);
insert into socio(nombre, cedula, telefono, provincia, ciudad, direccion, cuota) values ('Dolger Campos', '200930456', '8123-5678', 'Alajuela', 'Monterrey', 'Las Delicias', 12000);

select * from socio

insert into cancha(caracteristicas, nombre, dimensiones, tipo) values ('Fuertes Rafagas de viento', 'La bombonera', '110m x 70m', 'Zacate');
insert into cancha(caracteristicas, nombre, dimensiones, tipo) values ('Mucha humedad', 'La olla magica', '50m x 15m', 'Cemento');
insert into cancha(caracteristicas, nombre, dimensiones, tipo) values ('Exelente iluminacion', 'La bailada', '50m x 15m', 'Sintetica');

SELECT * from cancha

insert into gym(caracteristicas, nombre, dimensiones, cantMaquinas) values ('Gran variedad de maquinas', 'Los pilates', '30m x 30m', 26);
insert into gym(caracteristicas, nombre, dimensiones, cantMaquinas) values ('Aerobicos all day', 'EL brinca-brinca', '30m x 30m', 12);
insert into gym(caracteristicas, nombre, dimensiones, cantMaquinas) values ('Exelente iluminacion', 'La luz', '30m x 30m', 20);

SELECT * from gym


insert into piscina(caracteristicas, nombre, dimensiones, profundidad, carriles) values ('Agua muy fria', 'La congeladera', '30m x 30m', 2, 8);
insert into piscina(caracteristicas, nombre, dimensiones, profundidad, carriles) values ('Agua Caliente', 'La brasita', '30m x 30m', 1, 6);
insert into piscina(caracteristicas, nombre, dimensiones, profundidad, carriles) values ('Olimpica', 'KKK', '30m x 30m', 2, 12);


select * from piscina

insert into pista(caracteristicas, nombre, dimensiones, carriles) values ('Superficie resbalosa', 'La mantequilla', '30m x 30m', 8);
insert into pista(caracteristicas, nombre, dimensiones, carriles) values ('Superficie aspera', 'La pola', '30m x 30m', 6);
insert into pista(caracteristicas, nombre, dimensiones, carriles) values ('Animales en la pista', 'Pista chuchu', '30m x 30m', 12);


select *from pista
SELECT  * from articulo 
SELECT * from piscina
SELECT  * from reserva

SELECT  * from reservaarticulo

--drop table articulo

