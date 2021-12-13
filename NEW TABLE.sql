-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: miniproject
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userlogin` (
  `User_ID` int NOT NULL,
  `Password` varchar(25) NOT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
INSERT INTO `userlogin` VALUES (10001,'10001'),(10002,'10002'),(10003,'10003'),(10004,'10004'),(10005,'10005'),(10006,'10006'),(10007,'10007'),(10008,'10008'),(10009,'10009'),(10010,'10010');
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicledetails`
--

DROP TABLE IF EXISTS `vehicledetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicledetails` (
  `Vehicle Number` varchar(10) NOT NULL,
  `Owner's Name` varchar(30) NOT NULL,
  `Contact Details` bigint NOT NULL,
  `Adhar Card` bigint NOT NULL,
  `Bank A/C Details` bigint NOT NULL,
  `Insurance Validity` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicledetails`
--

LOCK TABLES `vehicledetails` WRITE;
/*!40000 ALTER TABLE `vehicledetails` DISABLE KEYS */;
INSERT INTO `vehicledetails` VALUES ('MH12MM1234','Mayuri Mahadik',7807454532,574378356578,57362988812,'2022-10-13'),('MH14PS1235','Pritesh Suryawanshi',8974577832,5742668324578,57562934812,'2022-04-03'),('MH13SR1236','Shubham Raghawant',7845457832,574373424578,556742934812,'2022-12-23'),('MH15NK1534','Nikhil Kundgar',7807765832,574378324348,57363424812,'2022-09-08'),('MH12NP1255','Nisha Punekar',7807496832,5743783234348,57362934812,'2022-02-23'),('MH22SD1274','Shashikant Deshpande',7834457832,576748324578,573653934812,'2022-07-15'),('MH45AP1264','Anup Pardhi',7807457722,574374724578,526629276812,'2022-11-22'),('MH47PS1257','Pravin Sen',7807457825,5743783894578,57882456812,'2022-05-29'),('MH07PM1454','Prashant Munshi',7889357832,572378324578,56782934812,'2022-03-31'),('MH09MP1204','Mayuri Pelagade',7889457832,578978324578,57242934812,'2022-04-25');
/*!40000 ALTER TABLE `vehicledetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `violationdetails`
--

DROP TABLE IF EXISTS `violationdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `violationdetails` (
  `Vehicle_Number` varchar(10) DEFAULT NULL,
  `Drink_and_Drive` int DEFAULT NULL,
  `Riding_Triple_Seat` int DEFAULT NULL,
  `Riding_Without_Helmet` int DEFAULT NULL,
  `Using_Mobile` int DEFAULT NULL,
  `Over_Speeding` int DEFAULT NULL,
  `Fancy_Number_Plate` int DEFAULT NULL,
  `Jumping_Red_Light` int DEFAULT NULL,
  `Illegal_Modification` int DEFAULT NULL,
  `Zebra_Crossing` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `violationdetails`
--

LOCK TABLES `violationdetails` WRITE;
/*!40000 ALTER TABLE `violationdetails` DISABLE KEYS */;
INSERT INTO `violationdetails` VALUES ('MH14HS1001',0,0,0,0,0,0,0,0,0),('MH14HS1001',0,0,0,0,0,0,0,0,0),('MH14HS1001',0,0,0,0,0,0,0,0,0),('MH14EU7576',0,0,0,0,0,0,0,0,0),('MH23EW2312',0,0,0,0,0,0,0,0,0);
/*!40000 ALTER TABLE `violationdetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-13 18:57:00
