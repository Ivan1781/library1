drop database if exists books;

create database if not exists books;

use books;

drop table if exists author;
drop table if exists title;


create table if not exists author (
id int primary key,
author varchar(35)
);

create table if not exists title (
id int,
title varchar(35),
century int
);

