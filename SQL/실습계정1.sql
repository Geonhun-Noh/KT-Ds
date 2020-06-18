select nvl2(comm,'O','X') as "CHECK NULL" from emp;

select empno, ename, comm,
case
    when comm is null then '해당사항 없음'
    when comm = 0 then '수당 없음'
    when comm > 0 then '수당 : ' || comm
    end as comm_text
from emp;

select empno, ename, job, sal,
    decode(job,
    'manager',sal*1.1,
    'salesman',sal*1.05,
    'analyst',sal,
    sal*1.03) as upsal
from emp;

ALTER TABLE DEPT;


select ename, upper(ename), lower(ename), initcap(ename)
from emp;

select ename, length(ename) from emp;

select job,
    substr(job,1,2),substr(job,3,2),substr(job,5)
    from emp;
    
select '010-7156-7260' as phonenumber,
    replace('010-7156-7260','-',' ') as replace_1,
    replace('010-7156-7260','-') as replace_2
from dual;

select empno, ename, hiredate, add_months(hiredate,120) as work10year
from emp;

--1번
select empno,ename,hiredate,
    to_char(next_day(add_months(hiredate,3),2),'yyyy-mm-dd') as R_JOB, 
    case
    when comm is null then 'N/A'
    when comm is not null then to_char(comm)
    end as comm
    from emp;
    
    
--2번
select empno, ename, sal,trunc(sal/21.5,2) as DAY_PAY, round(sal/21.5/8,1) as TIME_PAY
from emp;

--3번
select empno, 
    replace(to_char(empno),substr(to_char(empno),3),'**') as masking_empno,
    ename,
    replace(ename,substr(ename,2),'****') as masking_ename
from emp
where length(ename)>= 5 and length(ename) <6;


--3-1
select empno,
    rpad(substr(to_char(empno),1,2),length(empno),'*') as masking_empno,
    ename,
    rpad(substr(ename,1,1), length(ename), '*') as masking_ename
from emp
where length(ename)>= 5 and length(ename) <6;

select distinct sal from emp
where sal > 500;

select deptno, sum(sal)
from emp
group by deptno;

SELECT DEPTNO, MAX(SAL)
FROM EMP
GROUP BY DEPTNO;


SELECT JOB, DEPTNO, COUNT(JOB),AVG(SAL)
FROM EMP
GROUP BY DEPTNO,JOB
HAVING AVG(SAL)>=2000
ORDER BY DEPTNO;

SELECT DEPTNO, JOB, COUNT(*), MAX(SAL),SUM(SAL), AVG(SAL)
FROM EMP
GROUP BY CUBE (DEPTNO, JOB)
ORDER BY DEPTNO, JOB;

SELECT STATION_NAME
FROM subway_statistics
WHERE GUBUN='승차'
GROUP BY STATION_NAME
ORDER BY STATION_NAME;

SELECT 
    STATION_NAME,
    COUNT(*) CNT, 
    MIN(PASSENGER_NUMBER),
    MAX(PASSENGER_NUMBER), 
    SUM(PASSENGER_NUMBER), 
    AVG(PASSENGER_NUMBER),
    GUBUN
FROM SUBWAY_STATISTICS
GROUP BY STATION_NAME, GUBUN
ORDER BY STATION_NAME;

--출근 시간대에 하차가 가장 많은 역과 시간대
SELECT 
    STATION_NAME,
    GUBUN,
    BOARDING_TIME,
    SUM(PASSENGER_NUMBER)
FROM SUBWAY_STATISTICS
WHERE GUBUN = '하차'
GROUP BY STATION_NAME,GUBUN, BOARDING_TIME
ORDER BY SUM(PASSENGER_NUMBER) DESC;


--승하차 인원의 합계가 15000 ~ 16000명인 건 조회
SELECT
    STATION_NAME,
    SUM(PASSENGER_NUMBER)
FROM SUBWAY_STATISTICS
GROUP BY STATION_NAME
HAVING SUM(PASSENGER_NUMBER)>=15000 AND SUM(PASSENGER_NUMBER)<16000
ORDER BY SUM(PASSENGER_NUMBER)DESC;


--실습 1번
SELECT 
    DEPTNO,
    TRUNC(AVG(SAL)) AS AVG_SAL,
    MAX(SAL) AS MAX_SAL,
    MIN(SAL) AS MIN_SAL,
    COUNT(SAL) AS CNT
FROM EMP
GROUP BY DEPTNO
ORDER BY DEPTNO DESC;

--실습 2번
SELECT 
    JOB, 
    COUNT(*)
FROM EMP
GROUP BY JOB
HAVING COUNT(JOB)>=3;

--실습 3번
SELECT 
    SUBSTR(TO_CHAR(HIREDATE,'YYYY'),1,4) AS HIRE_YEAR,
    DEPTNO,
    COUNT(*) AS CNT
FROM EMP
GROUP BY SUBSTR(TO_CHAR(HIREDATE,'YYYY'),1,4), DEPTNO;
--ORDER BY HIRE_YEAR DESC;


select substr(to_char(hiredate,'yyyy'),1,4) as hire_date, deptno, count(*) cnt
from emp
group by deptno, substr(to_char(hiredate,'yyyy'),1,4)
order by hire_date desc;