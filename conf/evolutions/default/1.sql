# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  constraint pk_department primary key (id)
);

create table employee (
  username                      varchar(255) not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  role                          varchar(255),
  email                         varchar(255),
  password                      varchar(255),
  description                   varchar(255),
  constraint pk_employee primary key (username)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  county                        varchar(255),
  constraint pk_project primary key (id)
);


# --- !Downs

drop table if exists department;

drop table if exists employee;

drop table if exists project;

