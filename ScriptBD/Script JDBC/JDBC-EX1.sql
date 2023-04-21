create database jdbc;
use jdbc;

create table registros(
personId int,
nombre varchar(20) not null,
apellido varchar(20) not null,
email varchar(25) not null,

primary key(personId)
);

insert into registros(personId, nombre, apellido, email)
values('1', 'Maria', 'Schuindt', 'maruschuindt07@gmail.com'),
('2', 'Fernando', 'Silvero', 'FerSilvero@gmail.com');