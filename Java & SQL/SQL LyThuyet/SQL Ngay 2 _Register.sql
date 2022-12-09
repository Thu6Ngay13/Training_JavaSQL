/*
CREATE TABLE Register(
	ma_dang_ky varchar(255),
	ma_sinh_vien varchar(255),
	ma_mon_hoc varchar(255),
	PRIMARY KEY (ma_dang_ky),
	FOREIGN KEY (ma_sinh_vien) REFERENCES SinhVien(ma_sinh_vien),
	FOREIGN KEY (ma_mon_hoc) REFERENCES MonHoc(ma_mon_hoc)
);
*/