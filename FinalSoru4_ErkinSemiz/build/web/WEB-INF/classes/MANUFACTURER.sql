/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Erkin
 * Created: 03.Haz.2018
 */

CREATE TABLE MANUFACTURER(
MANUFACTURER_ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS
	AS IDENTITY (START WITH 1, INCREMENT BY 1),
NAME_ varchar(255),
ADDRESSLINE1 varchar(255),
ADDRESSLINE2 varchar(255),
CITY varchar(255),
STATE_ varchar(255),
ZIP INTEGER,
PHONE INTEGER,
FAX INTEGER,
EMAIL varchar(255),
);