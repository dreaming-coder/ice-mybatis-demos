create table t_dept
(
    did       int auto_increment
        primary key,
    dept_name varchar(20) null
);

INSERT INTO mybatis.t_dept (did, dept_name) VALUES (1, 'A');
INSERT INTO mybatis.t_dept (did, dept_name) VALUES (2, 'B');
INSERT INTO mybatis.t_dept (did, dept_name) VALUES (3, 'C');
