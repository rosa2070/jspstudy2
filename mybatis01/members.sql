drop table members;
create table members 
(
    num number(4) primary key,
    name varchar2(20),
    phone varchar2(20),
    addr varchar2(100),
    regdate date
);

drop table member;
create table member
(
    userid varchar2(15) primary key,
    pwd varchar2(20),
    email varchar2(20),
    regdate date    
);