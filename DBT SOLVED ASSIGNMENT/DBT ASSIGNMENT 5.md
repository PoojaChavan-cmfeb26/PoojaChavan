DBT ASSIGNMENT NO 5

mysql> SELECT \* FROM CUSTOMER;
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

1. Write a query that will give you all orders for more than Rs. 1,000.  
SELECT \* FROM orders WHERE Amt> 1000;

select \* from orders where Amt>1000;
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

2. Write a query that will give you the names and cities of all salespeople in
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

3. Write a query on the Customers table whose output will exclude all customers
with a rating <= 100, unless they are located in Rome.

mysql> select \* from customer where Rating>100 OR City='ROME';
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

mysql> SELECT \* FROM Customer WHERE Rating > 100 OR City = 'ROME';
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



4. What will be the output from the following query?  
Select \* from Orders where (amt < 1000 OR NOT (odate = ‘1990-10-03’ AND cnum > 2003));

mysql> select \* from orders where (amt < 1000 or not(odate = '1990-10-03' and cnum > 2003));
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
Select \* from Orders where NOT ((Odate=‘1990-10-03’ OR Snum >1006) AND Amt >= 1500);
Step 1: Break down the condition

* Inner part: (odate = '1990-10-03' OR snum > 1006) AND amt >= 1500
* This is true if:
* The order date is 1990-10-03 or the salesperson number is greater than 1006,
* and the amount is at least 1500.
* The outer NOT means we want rows where this condition is false.
So the query excludes orders that meet all of:
* Date = 1990-10-03 OR Snum > 1006
* Amt ≥ 1500



6. What is a simpler way to write this query?  
Select snum, sname, city, comm From Salespeople  
where (comm > .12 OR comm <.14);



SELECT snum, sname, city, comm
FROM Salespeople
WHERE comm > 0.12 AND comm < 0.14;



SELECT snum, sname, city, comm
FROM Salespeople;

