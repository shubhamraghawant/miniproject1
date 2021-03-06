CREATE DATABASE MINIPROJECT;
USE MINIPROJECT;
CREATE TABLE USERLOGIN
(`User ID` INT NOT NULL, 
`Password` VARCHAR  (25) NOT NULL,
PRIMARY KEY(`User ID`));
INSERT INTO USERLOGIN VALUES
(10001,'10001'),
(10002,'10002'),
(10003,'10003'),
(10004,'10004'),
(10005,'10005'),
(10006,'10006'),
(10007,'10007'),
(10008,'10008'),
(10009,'10009'),
(10010,'10010');
CREATE TABLE VEHICLEDETAILS 
(`Vehicle Number`VARCHAR(10) NOT NULL,
`Owner's Name` VARCHAR(30) NOT NULL,
`Contact Details` BIGINT NOT NULL,
`Adhar Card`BIGINT NOT NULL,
`Bank A/C Number`BIGINT NOT NULL,
`Insurance Validity`DATE NOT NULL);
ALTER TABLE VEHICLEDETAILS RENAME COLUMN `Bank A/C Number` TO `Bank A/C Details`;
INSERT INTO VEHICLEDETAILS VALUES
('MH12MM1234','Mayuri Mahadik',7807454532,574378356578,57362988812,'2022-10-13'),
('MH14PS1235','Pritesh Suryawanshi',8974577832,5742668324578,57562934812,'2022-04-03'),
('MH13SR1236','Shubham Raghawant',7845457832,574373424578,556742934812,'2022-12-23'),
('MH15NK1534','Nikhil Kundgar',7807765832,574378324348,57363424812,'2022-09-08'),
('MH12NP1255','Nisha Punekar',7807496832,5743783234348,57362934812,'2022-02-23'),
('MH22SD1274','Shashikant Deshpande',7834457832,576748324578,573653934812,'2022-07-15'),
('MH45AP1264','Anup Pardhi',7807457722,574374724578,526629276812,'2022-11-22'),
('MH47PS1257','Pravin Sen',7807457825,5743783894578,57882456812,'2022-05-29'),
('MH07PM1454','Prashant Munshi',7889357832,572378324578,56782934812,'2022-03-31'),
('MH09MP1204','Mayuri Pelagade',7889457832,578978324578,57242934812,'2022-04-25');

CREATE TABLE VIOLATIONDETAILS
(`Vehicle Number` VARCHAR(10),`Drink and Drive`INT,`Riding Triple Seat`INT,`Riding Without Helmet`INT,`Using Mobile`INT,`Over Speeding`INT,
 `Fancy Number Plate`INT,`Jumping Red Light`INT,`Illegal Modification`INT,`Zebra Crossing`INT);
 ALTER TABLE VEHICLEDETAILS ADD  COLUMN`IFSC Code` VARCHAR(10) AFTER `Bank A/C Details`;
 SELECT * FROM VEHICLEDETAILS;
ALTER TABLE VEHICLEDETAILS DROP COLUMN `IFSC Code`; 
 
 
