select * from member;

insert into member values ('javajava', 'aaa', 'aaa', 10, sysdate);

drop table fileinfo;
create table fileinfo
(
    filenum number(5) primary key,
    writer varchar2(20),
    title varchar2(50),
    content varchar2(100),
    orgfilename varchar2(150),
    savefilename varchar2(150),
    filesize number
);

create sequence fileinfo_seq;
leinfo;
select * from fileinfo;