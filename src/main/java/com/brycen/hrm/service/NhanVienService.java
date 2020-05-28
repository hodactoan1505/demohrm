package com.brycen.hrm.service;

import java.util.List;

import com.brycen.hrm.model.Nhanvien;

public interface NhanVienService {
	List<Nhanvien> getDanhSachNhanVien();
	void saveNhanVien(Nhanvien nhanvien);
	List<Nhanvien> getNhanVienByKiNang();
}
