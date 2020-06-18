CREATE TABLE emp_master
(
  emp_id     NUMBER        NOT NULL, --�����ȣ
  emp_name   VARCHAR2(100) NOT NULL, --�����
  gender     VARCHAR2(10),           --����
  age        NUMBER,                 --����
  hire_date  DATE,                   --�Ի�����
  dept_id    NUMBER,                 --�μ����̵�
  address_id NUMBER,                 --�ּҾ��̵�
  CONSTRAINT emp_master_pk PRIMARY KEY (emp_id)
);

CREATE TABLE dept_master (
  dept_id    NUMBER NOT NULL,         --�μ����̵�
  dept_name  VARCHAR2(50),            --�μ� ��
  use_yn     VARCHAR2(2) DEFAULT 'Y', --��뿩��
  dept_desc  VARCHAR2(100),           --�μ�����
  CONSTRAINT dept_master_pk PRIMARY KEY (dept_id)
);


CREATE TABLE address_master (
  address_id   NUMBER NOT NULL,       --�ּҾ��̵�
  city         VARCHAR2(100),         --���� ��
  gu           VARCHAR2(50),          --�� ��
  address_name VARCHAR2(100),         --������ �ּ�
  CONSTRAINT address_master_pk PRIMARY KEY (address_id)
);


INSERT INTO emp_master ( emp_id, emp_name, gender, age, hire_date, dept_id, address_id )
VALUES (1, '����', '����', 56, TO_DATE('2018-01-01', 'YYYY-MM-DD'), 1, 1);

INSERT INTO emp_master ( emp_id, emp_name, gender, age, hire_date, dept_id, address_id )
VALUES (2, 'ä��ȭ', '����', 34, TO_DATE('2018-01-01', 'YYYY-MM-DD'), 1, 2);

INSERT INTO emp_master ( emp_id, emp_name, gender, age, hire_date, dept_id, address_id )
VALUES (3, '������', '����', 45, TO_DATE('2018-01-01', 'YYYY-MM-DD'), 3, 2);

INSERT INTO emp_master ( emp_id, emp_name, gender, age, hire_date, dept_id, address_id )
VALUES (4, '������', '����', 23, TO_DATE('2018-01-01', 'YYYY-MM-DD'), 2, 3);

INSERT INTO emp_master ( emp_id, emp_name, gender, age, hire_date, dept_id, address_id )
VALUES (5, '�缮��', '����', 45, TO_DATE('2018-01-01', 'YYYY-MM-DD'), 4, 4);

INSERT INTO emp_master ( emp_id, emp_name, gender, age, hire_date, dept_id, address_id )
VALUES (6, '���ؿ�', '����', 35, TO_DATE('2018-01-01', 'YYYY-MM-DD'), NULL, 4);


INSERT INTO dept_master ( dept_id, dept_name )
VALUES (1, 'ȸ����');

INSERT INTO dept_master ( dept_id, dept_name )
VALUES (2, '�濵��');

INSERT INTO dept_master ( dept_id, dept_name )
VALUES (3, '������');

INSERT INTO dept_master ( dept_id, dept_name )
VALUES (4, '��������');

INSERT INTO dept_master ( dept_id, dept_name )
VALUES (5, 'IT��');

INSERT INTO address_master ( address_id, city, gu, address_name )
VALUES (1, '����Ư����', '�߱�', '�����ȷ� 12');

INSERT INTO address_master ( address_id, city, gu, address_name )
VALUES (2, '����Ư����', '���빮��', '����� 15��');

INSERT INTO address_master ( address_id, city, gu, address_name )
VALUES (3, '����Ư����', '��������', '���Ǵ�� 99');

INSERT INTO address_master ( address_id, city, gu, address_name )
VALUES (4, '����Ư����', '������', '������� 33');


COMMIT;