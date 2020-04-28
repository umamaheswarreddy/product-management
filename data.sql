CREATE DATABASE productmanagement;
 USE productmanagement;
CREATE TABLE PRODUCTS(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    PRICE NUMERIC NOT NULL,
    description VARCHAR(600) NOT NULL,
    NAME VARCHAR(200) NOT NULL,
    VID INT REFERENCES VENDORS(VID)
); CREATE TABLE VENDORS(
    VID INT PRIMARY KEY AUTO_INCREMENT,
    city VARCHAR(200),
    line1 VARCHAR(200),
    line2 VARCHAR(200),
    pincode VARCHAR(6),
    state VARCHAR(200),
    EMAIL VARCHAR(200) NOT NULL,
    NAME VARCHAR(150) NOT NULL,
    phone CHAR(10) NOT NULL
); INSERT INTO vendors
VALUES(
    201,
    "hyd",
    "hightechcity",
    "firstcross",
    "51001",
    "telangana",
    "meena@gmail.com",
    "meena",
    "8888865389"
);

 INSERT INTO vendors
 VALUES(
    202,
    "anantapur",
    "sku",
    "secondcross",
    "51501",
    "andra",
    "mahesh@gmail.com",
    "mahesh",
    "9999865389"
);
INSERT INTO vendors
 VALUES(
    203,
    "bheemavaram",
    "prakashnagar",
    "secondcross",
    "51401",
    "andra",
    "bala@gmail.com",
    "baladhurga",
    "7416565389"
);
INSERT INTO products
VALUES(1, 50000, "digital","tv" 201);

INSERT INTO products
VALUES(2, 20000, "digital","friz" 202);

INSERT INTO products
VALUES(3, 25000, "digital","cooler" 203);

