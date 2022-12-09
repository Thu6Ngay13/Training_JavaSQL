/*
CREATE TABLE STUDENT(
	Student_ID varchar(255),
	Student_name varchar(255),
	Student_address varchar(255),
	Student_gpa float,
	Student_birth date
	PRIMARY KEY(Student_ID)
);

INSERT INTO STUDENT VALUES
('SV001', 'Nguyen Van Nam', 'Hai Duong', 3.2, '2002-02-10'),
('SV002', 'Hoang Dinh Nam', 'Ha Noi', 2.8, '1999-08-08'),
('SV003', 'Pham Ngoc Thuan', 'Nam Dinh', 2.2, '1999-12-20'),
('SV004', 'Nguyen Duc Xuan', 'Thai Binh', 2.1, '1999-07-18'),
('SV005', 'Hoang Van Long', 'Ha Noi', 3.4, '2001-10-10'),
('SV006', 'Nguyen Ngoc Long', 'Nam Dinh', 3.1, '2001-12-19'),
('SV007', 'Nguyen Thuy Linh', 'Hai Duong', 3.7, '2001-03-03'),
('SV008', 'Nguyen Thuy Huong', 'Nghe An', 2.8, '1999-04-20');
*/

/*3*/SELECT * FROM STUDENT;
/*4*/SELECT * FROM STUDENT WHERE Student_gpa >= 3.2;
/*5*/SELECT * FROM STUDENT WHERE Student_address = 'Hai Duong';
/*6*/SELECT * FROM STUDENT WHERE Student_address = 'Nam Dinh' AND Student_gpa >= 3.2;
/*7*/SELECT * FROM STUDENT WHERE Student_gpa BETWEEN 2.5 AND 3.2;
/*8*/SELECT * FROM STUDENT WHERE Student_name LIKE '[hp]%';
/*9*/SELECT * FROM STUDENT WHERE Student_name LIKE '%[gm]'AND LEN(Student_name) >= 5;
/*10*/SELECT * FROM STUDENT WHERE Student_address = 'Hai Duong' OR Student_address = 'Nam Dinh' AND YEAR(Student_birth) > 2000;
/*11*/SELECT * FROM STUDENT WHERE Student_name LIKE '%[a-h]%';
/*12*/SELECT * FROM STUDENT ORDER BY Student_gpa DESC;
/*13*/SELECT DISTINCT Student_address FROM STUDENT
/*14*/SELECT * FROM STUDENT WHERE Student_address NOT LIKE '%[a-g]%';
/*16*/SELECT * FROM STUDENT WHERE;
/*17*/SELECT AVG(Student_gpa) FROM STUDENT;
/*18*/SELECT MAX(Student_gpa) FROM STUDENT;
/*19*/SELECT MIN(Student_gpa) FROM STUDENT;
/*20*/SELECT * FROM STUDENT WHERE Student_gpa = (SELECT MAX(Student_gpa) FROM STUDENT) ORDER BY Student_ID ASC;
/*21*/SELECT * FROM STUDENT WHERE Student_gpa = (SELECT MIN(Student_gpa) FROM STUDENT);
/*22*/SELECT TOP(3) * FROM STUDENT ORDER BY Student_gpa DESC, Student_ID ASC;
/*23*/SELECT * FROM STUDENT WHERE LEN(Student_address) >= 9 ORDER BY Student_gpa DESC;
/*24*/SELECT * FROM STUDENT WHERE Student_gpa > (SELECT AVG(Student_gpa) FROM STUDENT) ORDER BY Student_gpa DESC;
/*25*/SELECT * FROM STUDENT WHERE Student_name LIKE '%nh' OR Student_name LIKE '%an';
/*25*/SELECT * FROM STUDENT WHERE RIGHT(Student_name, 2) IN ('nh', 'an');
/*26*/SELECT * FROM STUDENT WHERE Student_name LIKE 'tra%' OR Student_name LIKE 'ngu%' ORDER BY Student_address ASC;
/*27*/SELECT * FROM STUDENT WHERE MONTH(Student_birth) = 7 AND YEAR(Student_birth) = 1999;
/*28*/SELECT * FROM STUDENT WHERE Student_birth = (SELECT MAX(Student_birth) FROM STUDENT) ORDER BY Student_ID ASC;
/*29*/SELECT * FROM STUDENT WHERE Student_birth = (SELECT MIN(Student_birth) FROM STUDENT) ORDER BY Student_gpa DESC;
/*30*/SELECT COUNT(Student_address) AS SoLuongSV, Student_address FROM STUDENT 
GROUP BY Student_address ORDER BY COUNT(Student_address) DESC;
/*30*/SELECT Student_address, COUNT(Student_address) FROM STUDENT
GROUP BY Student_address ORDER BY COUNT(Student_address) DESC;
/*31*/SELECT * FROM STUDENT WHERE
/*32*/SELECT * FROM STUDENT WHERE
/*33*/SELECT * FROM STUDENT WHERE
/*34*/SELECT DATEDIFF(DAY, (SELECT MIN(Student_birth) FROM STUDENT), (SELECT MAX(Student_birth) FROM STUDENT));

/*
SELECT ...
FROM ...
GROUP BY ...
HAVING ...
ORDER BY ...
*/