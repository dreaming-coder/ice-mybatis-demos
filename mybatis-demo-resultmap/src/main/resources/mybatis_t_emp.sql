create table t_emp
(
    eid      int auto_increment
        primary key,
    emp_name varchar(20) null,
    age      int         null,
    sex      char        null,
    email    varchar(20) null,
    did      int         null
);

INSERT INTO mybatis.t_emp (eid, emp_name, age, sex, email, did) VALUES (1, '张三', 18, '男', '123@qq.com', 1);
INSERT INTO mybatis.t_emp (eid, emp_name, age, sex, email, did) VALUES (2, '李四', 26, '女', '456@qq.com', 2);
INSERT INTO mybatis.t_emp (eid, emp_name, age, sex, email, did) VALUES (3, '王五', 32, '男', '789@qq.com', 3);
INSERT INTO mybatis.t_emp (eid, emp_name, age, sex, email, did) VALUES (4, '赵六', 24, '女', '007@qq.com', 1);
INSERT INTO mybatis.t_emp (eid, emp_name, age, sex, email, did) VALUES (5, '田七', 14, '男', '741@qq.com', 2);
