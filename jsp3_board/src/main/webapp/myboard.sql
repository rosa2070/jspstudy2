create table myboard
(
	num number(5) primary key,
	writer varchar2(30),
	title varchar2(30),
	content varchar2(4000),
	regdate date
);
create sequence myboard_seq;

insert into myboard values(myboard_seq.nextval, 'test', 'hello', '비가 오네요..', sysdate);
commit;

-- SQL Developer 다운로드
-- https://www.oracle.com/database/sqldeveloper/technologies/download/

-- 최신순이니까 내림차순
select * from myboard order by regdate desc where num>=1 and num<=10; 

select rownum, num, writer, title from myboard order by num desc;

select * from
(
    select b.*, rownum rnum from (
        select * from myboard order by num desc
    )b 
) where rnum>=1 and rnum<=10;

select count(*) from myboard;

