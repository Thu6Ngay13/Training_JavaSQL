
DROP TABLE SinhVien
CREATE TABLE SinhVien(
	ma_sinh_vien varchar(255) NOT NULL,
	ten varchar(255),
	dia_chi varchar(255),
	gpa float,
	ngay_sinh date,
	PRIMARY KEY (ma_sinh_vien)
);

INSERT INTO SinhVien VALUES 
('SV001', 'Nguyen Van Nam', 'Hai Duong', 3.2, '2002-02-10'),
('SV002', 'Hoang Dinh Nam', 'Ha Noi', 2.8, '1999-08-08'),
('SV003', 'Pham Ngoc Thuan', 'Nam Dinh', 2.2, '1999-12-20'),
('SV004', 'Nguyen Duc Xuan', 'Thai Binh', 2.1, '1999-07-18'),
('SV005', 'Hoang Van Long', 'Ha Noi', 3.4, '2001-10-10'),
('SV006', 'Nguyen Ngoc Long', 'Nam Dinh', 3.1, '2001-12-19'),
('SV007', 'Nguyen Thuy Linh', 'Hai Duong', 3.7, '2001-03-03'),
('SV008', 'Nguyen Thuy Huong', 'Nghe An', 2.8, '1999-04-20');
*/
SELECT CHARINDEX('u', 'Nguyen Van Nam');
SELECT CONCAT(ma_sinh_vien, ' ', ten, ' ', dia_chi) AS full_infor FROM SinhVien;
SELECT ma_sinh_vien + ' ' + ten AS full_infor FROM SinhVien;

SELECT LEN(ten) AS chieu_dai_ten FROM SinhVien;
SELECT LEFT(ten, 4) AS temp FROM SinhVien;
SELECT RIGHT(ten, 4) AS temp FROM SinhVien;

SELECT LTRIM('    Nguyen Van Teo  ');
SELECT RTRIM('    Nguyen Van Teo  ');
SELECT LOWER('    Nguyen Van Teo  ');
SELECT UPPER('    Nguyen Van Teo  ');
SELECT REPLACE('Ung Hoa, Ha Tay', 'Ha Tay', 'Ha Noi');
SELECT REVERSE('Nguyen Van Teo');
SELECT SUBSTRING('Nguyen Van Teo', 12, 3);

SELECT ABS(-100) as gia_tri_tuyet_doi;
SELECT AVG(gpa) as gpa_trung_binh FROM SinhVien;
SELECT CEILING(3.2); --lay ra so nguyen gan nhat lon hon no
SELECT FLOOR(3.7); --lay ra so nguyen gan nhat nho hon no
SELECT ROUND(34.93948, 2); --lam tron den 2 so

SELECT MAX(gpa) FROM SinhVien;
SELECT MIN(gpa) FROM SinhVien;
SELECT POWER(2, 10) AS LuyThua;
SELECT SQRT(100) AS Can;

SELECT * FROM SinhVien WHERE gpa = MAX(gpa); --Khong dung duoc
SELECT * FROM SinhVien WHERE gpa = (SELECT MAX(gpa) FROM SinhVien);
SELECT * FROM SinhVien WHERE gpa = (SELECT MAX(gpa) FROM SinhVien);

SELECT DAY(ngay_sinh) FROM SinhVien;
SELECT MONTH(ngay_sinh) FROM SinhVien;
SELECT YEAR(ngay_sinh) FROM SinhVien;

SELECT MAX(ngay_sinh) FROM SinhVien;
SELECT MIN(ngay_sinh) FROM SinhVien;
SELECT DATEDIFF(DAY, (SELECT MAX(ngay_sinh) FROM SinhVien), (SELECT MIN(ngay_sinh) FROM SinhVien));





