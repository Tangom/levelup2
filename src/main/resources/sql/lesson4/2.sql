USE CAR;
DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE CUSTOMER (
	CUSTOMER_ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME varchar(30) not NULL,
    SURNAME VARCHAR(30) not null,
    PHONE int,
    VIN INT NOT NULL,
    FOREIGN KEY (VIN) REFERENCES CAR(VIN)
);

insert into customer(NAME, SURNAME, PHONE,VIN) values ("Ivan", "Ivanov", 4903043, 1453342);
insert into customer(NAME, SURNAME, PHONE,VIN) values ("Petr", "Petrov", 542872, 1453342);
insert into customer(NAME, SURNAME, PHONE,VIN) values ("Dmitry", "Sidorov", 2782107,41541);
insert into customer(NAME, SURNAME, PHONE,VIN) values ("Sasha", "Ivanov", 91435,1453342);
insert into customer(NAME, SURNAME, PHONE,VIN) values ("Kirill", "Miheev", 2728567,41541);

select * from customer;