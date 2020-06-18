--서브쿼리(인라인 뷰 : FROM절에 SELECT문)
SELECT A.EMPNO, A.ENAME, A.SAL, ROUND(B.AVGS),B.MAXS
FROM EMP A, (SELECT AVG(SAL) AVGS,
            MAX(SAL) MAXS FROM EMP) B
WHERE A.SAL BETWEEN B.AVGS AND B.MAXS
ORDER BY A.SAL DESC;

SELECT AVG(SAL) AVGS, MAX(SAL) MAXS FROM EMP;

SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE SAL BETWEEN 2073 AND 5000
ORDER BY SAL DESC;

--서브쿼리(스칼라 서브쿼리:SELECT문에 또다시 SELECT문 BUT 실무에선 많이 쓰이진 않는다.)
SELECT ename,
    (SELECT dname FROM dept d WHERE d.deptno = e.deptno) deptno
FROM emp e
WHERE job = 'MANAGER';

SELECT * FROM EMP WHERE ENAME='ALLEN';

--실습예제1 전체 사원 중 ALLEN과 같은 직책인 사원들의 사원정보, 부서정보를 출력
SELECT 
    A.JOB, A.EMPNO, A.ENAME, A.SAL, A.DEPTNO, DEPT.DNAME
FROM 
    EMP A INNER JOIN DEPT ON A.DEPTNO = DEPT.DEPTNO, 
    (SELECT * FROM EMP WHERE ENAME='ALLEN') B
WHERE A.JOB = B.JOB
ORDER BY SAL DESC;

--실습예제2 10번 부서에 근무하는 사원 중 30번 부서에는 존재하지 않는 직책을 가진 사원들의 사원정보, 부서정보 출력
SELECT
    A.EMPNO, A.ENAME, A.JOB, A.DEPTNO, D.DNAME, D.LOC
FROM 
    (SELECT * FROM EMP WHERE DEPTNO=10) A INNER JOIN DEPT D ON A.DEPTNO=D.DEPTNO
WHERE A.JOB NOT IN (SELECT JOB FROM EMP WHERE DEPTNO=30);

--부서별 최고급여와 동일한 급여를 받는 사원정보출력
SELECT *
FROM EMP
WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);


select ename, replace(ename,'A','n')
from emp;

select min(to_char(hiredate,'yyyy-mm-dd')) from emp;
