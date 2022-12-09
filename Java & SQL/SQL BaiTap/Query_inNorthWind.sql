SELECT ContactName, Orders.* FROM Customers, Orders
WHERE Customers.CustomerID = 'CONSH' AND Customers.CustomerID = Orders.CustomerID

SELECT CAST(38.273278 AS DECIMAL(10, 2));
SELECT o.OrderID, c.ContactName , CAST(SUM(o.UnitPrice*o.Quantity*(1-o.Discount)) AS DECIMAL(10, 2)) 
FROM [Order Details] AS o, Customers AS c, Orders
WHERE o.OrderID = Orders.OrderID AND  c.CustomerID = Orders.CustomerID
GROUP BY o.OrderID, c.ContactName;

/*
SELECT col_name FROM table1
INNER JOIN table2 ON table1.col_name = table2.col_name;
*/

SELECT Customers.ContactName, Orders.OrderID, Orders.OrderDate
FROM Customers INNER JOIN Orders
ON Customers.CustomerID = Orders.CustomerID;

SELECT Customers.ContactName, Orders.OrderID, Orders.OrderDate
FROM Customers LEFT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID;

SELECT Customers.ContactName, Orders.OrderID, Orders.OrderDate
FROM Customers RIGHT JOIN Orders
ON Customers.CustomerID = Orders.CustomerID;

SELECT Customers.ContactName, Orders.OrderID, Orders.OrderDate
FROM Customers FULL OUTER JOIN Orders
ON Customers.CustomerID = Orders.CustomerID;

