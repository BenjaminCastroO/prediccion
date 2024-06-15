create database prediccionv2;
use prediccionv2;
create table estudiantes (
 id int primary key auto_increment,
 name varchar(45),
 mail varchar(45),
 cellphone varchar(45),
 age int,
 gender varchar(45),
 year int,
 participation varchar(45),
 average double(2,1),
 approved int,
 failed int,
 omitted int,
 continuity int,
 study_time int,
 friend_time int,
 sport_time int,
 hobby_time int,
 stress int,
 satisfaction int,
 employment varchar(45),
 travel_time int)
 