-- mboard.sql 
drop table mboard;
create table mboard
(
	num number(5) primary key,
	writer varchar2(20),
	title varchar2(40),
	content varchar2(2000),
	regdate date
);
create sequence mboard_seq;