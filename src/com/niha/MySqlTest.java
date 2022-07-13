package com.niha;

public class MySqlTest {
    create database employee_payroll_service;
    show databases;
    use employee_payroll_service;

    create table employee_payroll(
            id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
            name varchar(50),
    salary INT,
    start_date DATE NOT NULL);

    insert into employee_payroll(name,salary,start_date) values("Niha",5000,"2021-04-19");
    insert into employee_payroll(name,salary,start_date) values("Rika",1000,"2011-11-21");

    select * from employee_payroll;

}
