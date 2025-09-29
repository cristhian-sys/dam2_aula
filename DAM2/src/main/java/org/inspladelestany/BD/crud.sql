create table Professors(
id int auto_increment primary key,
nom varchar(50),
cognom varchar(50)
);

insert into professors (id, nom, cognom)
values
(1, "Juan", "Martínez"),
(2, "María", "González"),
(3, "Carlos", "López");

create table ModulsProfessionals(
id int auto_increment primary key,
nom varchar(50),
id_professor int,
constraint fk_professor FOREIGN KEY (id_professor) 
REFERENCES professors(id) ON DELETE SET NULL ON UPDATE CASCADE
);

insert into ModulsProfessionals
values
(1, "Programacion", 1),
(2, "Base de datos", 2),
(3, "Sistemas informáticos", 3);