create table Product(name varchar(100) PRIMARY KEY, category varchar(100) NOT NULL);
create table ProductPriceHistory (name varchar(100) NOT NULL, price integer NOT NULL, start_date DATE NOT NULL, end_date DATE,FOREIGN KEY (name) REFERENCES Product(name));

/* get current item prices */
select product.name, pricehistory.price as current_price from Product as product, ProductPriceHistory as pricehistory where product.name = pricehistory.name AND pricehistory.end_date IS NULL;

/* Test Cases
insert into Product values('Milk','Dairy');
insert into Product values('Butter','Dairy');
insert into Product values('Dairy Milk','Chocolate');
INSERT INTO ProductPriceHistory values('Milk',23,'2022-02-10','2022-02-20');
INSERT INTO ProductPriceHistory values('Milk',23,'2022-03-10','2022-03-25');
INSERT INTO ProductPriceHistory values('Milk',23,'2022-03-12','2022-03-20');
INSERT INTO ProductPriceHistory values('Milk',23,'2022-03-20',NULL);
INSERT INTO ProductPriceHistory values('Butter',20,'2022-03-12',NULL);
INSERT INTO ProductPriceHistory values('Dairy Milk',30,'2022-03-30',NULL); 

Result
Name         Current_price
Milk              23
Butter            20
Dairy Milk        30
*/