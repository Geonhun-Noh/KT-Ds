--��������(�ζ��� �� : FROM���� SELECT��)
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

--��������(��Į�� ��������:SELECT���� �Ǵٽ� SELECT�� BUT �ǹ����� ���� ������ �ʴ´�.)
SELECT ename,
    (SELECT dname FROM dept d WHERE d.deptno = e.deptno) deptno
FROM emp e
WHERE job = 'MANAGER';

SELECT * FROM EMP WHERE ENAME='ALLEN';

--�ǽ�����1 ��ü ��� �� ALLEN�� ���� ��å�� ������� �������, �μ������� ���
SELECT 
    A.JOB, A.EMPNO, A.ENAME, A.SAL, A.DEPTNO, DEPT.DNAME
FROM 
    EMP A INNER JOIN DEPT ON A.DEPTNO = DEPT.DEPTNO, 
    (SELECT * FROM EMP WHERE ENAME='ALLEN') B
WHERE A.JOB = B.JOB
ORDER BY SAL DESC;

--�ǽ�����2 10�� �μ��� �ٹ��ϴ� ��� �� 30�� �μ����� �������� �ʴ� ��å�� ���� ������� �������, �μ����� ���
SELECT
    A.EMPNO, A.ENAME, A.JOB, A.DEPTNO, D.DNAME, D.LOC
FROM 
    (SELECT * FROM EMP WHERE DEPTNO=10) A INNER JOIN DEPT D ON A.DEPTNO=D.DEPTNO
WHERE A.JOB NOT IN (SELECT JOB FROM EMP WHERE DEPTNO=30);

--�μ��� �ְ�޿��� ������ �޿��� �޴� ����������
SELECT *
FROM EMP
WHERE SAL IN (SELECT MAX(SAL) FROM EMP GROUP BY DEPTNO);


select ename, replace(ename,'A','n')
from emp;

select min(to_char(hiredate,'yyyy-mm-dd')) from emp;
