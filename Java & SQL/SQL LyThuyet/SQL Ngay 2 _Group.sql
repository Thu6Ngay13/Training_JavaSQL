/*
SELECT column_name FROM table_name WHERE dieukien
GROUP BY col_name
ORDER BY col_name;
*/

SELECT COUNT(ma_sinh_vien) as SoLuongSV FROM SinhVien WHERE dia_chi = 'Nam Dinh';
SELECT AVG(gpa) as DiemTrungBinh FROM SinhVien WHERE dia_chi = 'Nam Dinh';
SELECT AVG(gpa) as DiemTrungBinh, dia_chi FROM SinhVien GROUP BY dia_chi;
SELECT SUM(gpa) as TongDiem FROM SinhVien WHERE dia_chi = 'Nam Dinh';
SELECT * FROM SINHVIEN WHERE gpa > (SELECT AVG(gpa) FROM SINHVIEN) ORDER BY gpa DESC;


SELECT SV.ma_sinh_vien, SV.ten, MH.ten_mon_hoc, MH.so_tin_chi 
FROM SinhVien AS SV, MonHoc AS MH, Register AS R
WHERE SV.ma_sinh_vien = R.ma_sinh_vien AND MH.ma_mon_hoc = R.ma_mon_hoc;
