/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Erkin
 * Created: 03.Haz.2018
 */
CREATE TABLE PRODUCT
(
    PRODUCTID INTEGER NOT NULL ,
    PURCHASE_COST INTEGER ,
    MANUFACTURER_ID INTEGER NOT NULL,
    PRODUCT_CODE INTEGER,
    QUANTITY_ON_HAND INTEGER,
    MARKUP INTEGER,
    AVAILABLE BOOLEAN,
    DESCRIPTION varchar(255),
 
    PRIMARY KEY (PRODUCTID),
 
    FOREIGN KEY (MANUFACTURER_ID) REFERENCES MANUFACTURER (MANUFACTURER_ID)
);