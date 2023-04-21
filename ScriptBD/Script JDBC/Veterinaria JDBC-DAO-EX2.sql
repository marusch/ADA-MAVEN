create database veterinaria;

use veterinaria;

create table informacion(
id int,
nombre varchar(30) not null,
años int not null,
raza  varchar(30),

primary key(id)
);

insert into informacion(id, nombre, años, raza)
 values(1, 'Jerry', 2,  'Pincher'),
 (2, 'Luna', 1, 'Siamés'),
 (3, 'Naranjoso', 1, 'Maine Coon'),
 (4, 'Lazy', 3, 'Collie');