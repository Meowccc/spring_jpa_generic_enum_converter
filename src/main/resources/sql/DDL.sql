create database if not exists `demo`;
use `demo`;

create table book
(
    id     char(36) primary key,
    status varchar(20),
    type   varchar(20)
);

