create table emp
(
code varchar(10) primary key,
name varchar(30),
city varchar(20),
salary double
);
// create procedure in MySQL
DELIMITER //

CREATE PROCEDURE proc2(IN code1 varchar(10))
BEGIN
   select * from emp where code=code1;
END; //

DELIMITER ;
==============
1. pkg1.connectiondemo - Obtain database connection programaticaly and through beans.xml
2. pkg1.jdbc.jdbctemplate - CRUD with jdbcTemplate, use RowMapper, create Batch and call Procedure,
3. pkg1.jdbc.namedtemplate - CRUD with NamedTemplate, use ResultSetExtractor and  RowMapper
4. pkg1.hibernatewithoutspring - It is simple hibarenate application without spring framework using .hbm.xml file
5. pkg1.hibernatewithoutspring.annotation - It is simple hibarenate application without spring framework using annotations

6. pkg1.hibernatewithspring - It is hibernate with spring framework with .hbm.xml
			beans1.xml - use hibernate.cfg.xml seperately for database connection
			beans2.xml - with hibernate.cfg.xml, all hibernate properties in beans2.xml file
7. pkg1.hibernatewithspring.ex1 - It is hibernate with spring framework with annotations
8. pkg1.jndidemo - Use database JNDI of Oracle WebLogic Server