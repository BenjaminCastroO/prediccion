use prediccionv2;
create table usuario (
id int primary key auto_increment,
username varchar(45),
password varchar(100),
rol varchar(45));
insert into usuario values(1,'benja','$2a$12$N7Db6TXrQ361FAJcnvJNHOWU44qnYlP9MEwl8zAcMcU2Gb5gyEcvW', 'EQUIPO')