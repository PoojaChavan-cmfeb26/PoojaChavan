DBT ASSIGNMENT NO 2

1)Which field of the Customers table is the primary key?

The field that uniquely identifies each customer is Cnum. Because Every customer must have a unique number, while names or cities could repeat.

2) The 4th column of the Customers table

- Rating ← this is the 4th column

3) Another word for row and column

- A row is also called a record or tuple.
- A column is also called a field or attribute.

4) Why isn’t it possible to see the first five rows of a table?

- In relational databases, tables are unordered sets of rows. That means:

- There’s no “first” or “last” row unless you explicitly order them using ORDER BY.

- Without ordering, the database can return rows in any sequence, so asking for “first five rows” doesn’t make sense unless you define a sorting rule (like by Cnum or Rating).

--------------------------------------------------------------------------

ASSIGNMENT NO 3

--------------------------------------------------------------------------

1) Does ANSI recognize the data type DATE?

Yes — the ANSI SQL standard does recognize DATE as a valid data type.

It stores calendar dates (year, month, day).

Some systems also extend it with TIME and TIMESTAMP for more precision.

2) Which subdivision of SQL is used to insert values in tables?

SQL is divided into different parts:

- DDL (Data Definition Language) → for creating tables, altering structures.

- DML (Data Manipulation Language) → for inserting, updating, deleting, and retrieving data.

- DCL (Data Control Language) → for permissions.

- TCL (Transaction Control Language) → for commits, rollbacks.

The subdivision used to insert values into tables is DML. Specifically, the INSERT INTO statement belongs to DML.

--------------------------------------------------------------------------------------------------------

ASSIGNMENT NO 4

-------------------------------------------------------------------------------------------------

1)Write a select command that produces the order number, amount, and date for all

rows in the Orders table.-We only need three columns: Onum, Amt, and Odate.

SELECT Onum, Amt, Odate FROM Orders;

2)Write a query that produces all .

SELECT * FROM Customers WHERE Snum = 1001;

3) Display Salespeople table with columns in order: , snum,city, sname comm

SELECT City, Sname, Snum, Comm FROM Salespeople;

4) Rating followed by name of each customer in San Jose

Here we filter by city and select only the two columns.

SELECT Rating, Cname FROM CustomerS WHERE City = 'San Jose';

5) Produce the Snum values of all salespeople with orders (suppress duplicates)
This is where DISTINCT comes in handy. 
SELECT DISTINCT Snum FROM Orders;

- SELECT → choose columns FROM → choose table
  WHERE → filter rows

DISTINCT → remove duplicates

SELECT * FROM Salespeople ORDER BY CITY DESC;

SELECT * FROM Part ORDER BY CITY ASC, PartName ASC;


-----------------------------------------------------------------------------------------------------------------------

ASSIGNMENT NO 5

mysql> SELECT * FROM CUSTOMER;
+------+----------+----------+--------+------+
| Cnum | Cname    | City     | Rating | Snum |
+------+----------+----------+--------+------+
| 2001 | HOFFMAN  | LONDON   |    100 | 1001 |
| 2002 | GIOVANNI | ROME     |    200 | 1003 |
| 2003 | LIU      | SAN JOSE |    200 | 1002 |
| 2004 | GRASS    | BERLIN   |    300 | 1002 |
| 2006 | CLEMENS  | LONDON   |    100 | 1001 |
| 2008 | CISNEROS | SAN JOSE |    300 | 1007 |
| 2007 | PEREIRA  | ROME     |    100 | 1004 |
+------+----------+----------+--------+------+
7 rows in set (0.00 sec)

1) Write a query that will give you all orders for more than Rs. 1,000.   
SELECT * FROM orders WHERE Amt> 1000;

select * from orders where Amt>1000;
+------+---------+------------+------+------+
| Onum | Amt     | Odate      | Cnum | Snum |
+------+---------+------------+------+------+
| 3002 | 1900.10 | 1990-10-03 | 2007 | 1004 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3006 | 1098.16 | 1990-10-03 | 2008 | 1007 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3008 | 4723.00 | 1990-10-05 | 2006 | 1001 |
| 3010 | 1309.95 | 1990-10-06 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-06 | 2006 | 1001 |
+------+---------+------------+------+------+
7 rows in set (0.01 sec)

2) Write a query that will give you the names and cities of all salespeople in 
London with a commission above .10.   

select sname, city from salespeople where city='LONDON' AND comm>0.10;
+--------+--------+
| sname  | city   |
+--------+--------+
| PEEL   | LONDON |
| MOTIKA | LONDON |
+--------+--------+
2 rows in set (0.00 sec)
SELECT sname, city, FROM salespeople WHERE city = 'LONDON' AND comm > 0.10;

3) Write a query on the Customers table whose output will exclude all customers 
with a rating <= 100, unless they are located in Rome. 

mysql> select * from customer where Rating>100 OR City='ROME';
+------+----------+----------+--------+------+
| Cnum | Cname    | City     | Rating | Snum |
+------+----------+----------+--------+------+
| 2002 | GIOVANNI | ROME     |    200 | 1003 |
| 2003 | LIU      | SAN JOSE |    200 | 1002 |
| 2004 | GRASS    | BERLIN   |    300 | 1002 |
| 2008 | CISNEROS | SAN JOSE |    300 | 1007 |
| 2007 | PEREIRA  | ROME     |    100 | 1004 |
+------+----------+----------+--------+------+
5 rows in set (0.00 sec)  

mysql> SELECT * FROM Customer WHERE Rating > 100 OR City = 'ROME';
+------+----------+----------+--------+------+
| Cnum | Cname    | City     | Rating | Snum |
+------+----------+----------+--------+------+
| 2002 | GIOVANNI | ROME     |    200 | 1003 |
| 2003 | LIU      | SAN JOSE |    200 | 1002 |
| 2004 | GRASS    | BERLIN   |    300 | 1002 |
| 2008 | CISNEROS | SAN JOSE |    300 | 1007 |
| 2007 | PEREIRA  | ROME     |    100 | 1004 |
+------+----------+----------+--------+------+
5 rows in set (0.00 sec)


4) What will be the output from the following query?   
Select * from Orders where (amt < 1000 OR NOT (odate = ‘1990-10-03’ AND cnum > 2003)); 

mysql> select * from orders where (amt < 1000 or not(odate = '1990-10-03' and cnum > 2003));
+------+---------+------------+------+------+
| Onum | Amt     | Odate      | Cnum | Snum |
+------+---------+------------+------+------+
| 3001 |   18.69 | 1990-10-03 | 2008 | 1007 |
| 3003 |  767.69 | 1990-10-03 | 2001 | 1001 |
| 3005 | 5160.45 | 1990-10-03 | 2003 | 1002 |
| 3009 | 1713.23 | 1990-10-04 | 2002 | 1003 |
| 3007 |   75.75 | 1990-10-04 | 2004 | 1002 |
| 3008 | 4723.00 | 1990-10-05 | 2006 | 1001 |
| 3010 | 1309.95 | 1990-10-06 | 2004 | 1002 |
| 3011 | 9891.88 | 1990-10-06 | 2006 | 1001 |
+------+---------+------------+------+------+
8 rows in set (0.00 sec)  


5)What will be the output of the following query?   
Select * from Orders where NOT ((Odate=‘1990-10-03’ OR Snum >1006) AND Amt >= 1500); 
 Step 1: Break down the condition
- Inner part: (odate = '1990-10-03' OR snum > 1006) AND amt >= 1500
- This is true if:
- The order date is 1990-10-03 or the salesperson number is greater than 1006,
- and the amount is at least 1500.
- The outer NOT means we want rows where this condition is false.
So the query excludes orders that meet all of:
- Date = 1990-10-03 OR Snum > 1006
- Amt ≥ 1500



6) What is a simpler way to write this query?   
Select snum, sname, city, comm From Salespeople              
where (comm > .12 OR comm <.14);  


SELECT snum, sname, city, comm
FROM Salespeople
WHERE comm > 0.12 AND comm < 0.14;


SELECT snum, sname, city, comm 
FROM Salespeople;

