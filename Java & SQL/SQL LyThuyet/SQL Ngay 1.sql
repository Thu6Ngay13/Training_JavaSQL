/*
CREATE TABLE TABLE_NAME(
	col1 datatype1,
	col2 datetype2,
	col3 datetype3,
	col4 datetype4,
	col5 datetype5,
	...
	coln datetypen,
	PRIMARY KEY(col1) //khoa chinh la col1
)
*/
/*
CREATE TABLE SinhVien(
	id varchar(255),
	name varchar(255),
	gpa float,
	PRIMARY KEY(id)
)
*/

/*
INSERT INTO tableName(col1, col2, ..., coln)
VALUES(value1, value2, ..., valuen)
*/

/*
INSERT INTO SinhVien
VALUES ('123', 'NVA', 2.5),
('124', 'NVA', 2.5),
('125', 'NVA', 2.5);
*/

/*
DROP TABLE table_name;
TRUNCATE TABLE table_name;
*/

/*
SELECT col1, col2, ...
FROM table_name;
*/

/*
SELECT id, name, gpa
FROM SinhVien;
SELECT id as MaSinhVien, name as HoTen, gpa as DiemTB
FROM SinhVien;
*/

/*
CREATE TABLE SinhVien(
	id varchar(255) NOT NULL,
	name varchar(255),
	address varchar(255),
	gpa float,
	PRIMARY KEY (id));
*/

INSERT INTO SinhVien 
VALUES ('123', 'Nguyen Van Nam', 'Nam Dinh', 2.5),
('124', 'Hoang Dinh Nam', 'Hai Duong', 3.2),
('125', 'Nguyen Van Tuan', 'Thai Binh', 2.1),
('126', 'Pham Ngoc Thien', 'Nam Dinh', 3.5),
('127', 'Vuong Hoang Nhung', 'Thai Binh', 2.5),
('128', 'Pham Van Long', 'Nam Dinh', 2.1),
('129', 'Pham Van Manh', 'Nghe An', 2.8);

SELECT * FROM SinhVien;
SELECT DISTINCT address
FROM SinhVien;

/*
SELECT col1, col2, col3
FROM table_name
WHERE CONDITION
*/
/*
+, -, *, /, %
AND, OR, NOT
>, >=, <, <=, !=, =
IN, NOT, BETWEEN
*/

SELECT *
FROM SinhVien
WHERE address = 'Nam Dinh' AND gpa >= 2.5

SELECT *
FROM SinhVien
WHERE gpa >= 2.5 AND gpa <= 3.2

SELECT *
FROM SinhVien
WHERE gpa BETWEEN 2.5 AND 3.2

SELECT *
FROM SinhVien
WHERE address <> 'Nam Dinh'

SELECT *
FROM SinhVien
WHERE (address = 'Thai Binh' OR address = 'Nam Dinh') and gpa >= 2.5

SELECT *
FROM SinhVien
WHERE address IN ('Thai Binh', 'Nam Dinh') AND gpa >= 2.5

SELECT *
FROM SinhVien
WHERE address NOT IN ('Thai Binh', 'Nam Dinh') AND gpa >= 2.5

/*
SELECT *
FROM SinhVien
WHERE CONDITION
ORDER BY col_name1, col_name2,... ASC | DESC;
*/

SELECT *
FROM SinhVien
WHERE address = 'Nam Dinh'
ORDER BY name DESC;

SELECT *
FROM SinhVien
ORDER BY address, name DESC;

/*
DELETE FROM TABLE 
WHERE CONDITION;
*/

DELETE FROM SinhVien
WHERE address = 'Nghe An';

SELECT * FROM SinhVien;

/*
SELECT * 
FROM table_name
WHERE column_name LIKE pattern
*/

SELECT * 
FROM SinhVien
WHERE name LIKE 'n%';

SELECT * 
FROM SinhVien
WHERE name LIKE '%n';

SELECT * 
FROM SinhVien
WHERE name LIKE '%van%';

--Loc ra nhung sinh vien co chu cai thu 2 la chu G
SELECT * 
FROM SinhVien
WHERE name LIKE '__uy%';

SELECT * 
FROM SinhVien
WHERE name LIKE '%u__';

SELECT * 
FROM SinhVien
WHERE name LIKE 'n%m';

--Loc ra nhung sinh vien co ten bat dau bang chu Ngu
--SQL SERVER: WILDCARD: %, _, ^, []
SELECT * FROM SinhVien
WHERE name LIKE '[nabc]%';

SELECT * FROM SinhVien
WHERE name LIKE '[^nabc]%';

SELECT * FROM SinhVien
WHERE name LIKE '[^nabc]oa%';

SELECT * FROM SinhVien
WHERE name LIKE '[a-h]%';

--Loc ra sinh vien que o nam dinh, co gpa >= 2.5
--Va trong ten khong duoc bat dau bang nhung chu cai tu a->n
--Va khong duoc ket thuc bang chu cai h -> n

SELECT * FROM SinhVien
WHERE address = 'Nam Dinh' AND gpa >= 2.5 AND name LIKE '[^a-n]%[^h-n]';