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
}
