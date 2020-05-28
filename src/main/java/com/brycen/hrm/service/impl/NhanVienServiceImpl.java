package com.brycen.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brycen.hrm.model.Nhanvien;
import com.brycen.hrm.repository.NhanVienRepository;
import com.brycen.hrm.service.NhanVienService;

@Service
public class NhanVienServiceImpl implements NhanVienService{
	
	@Autowired
	NhanVienRepository nhanVienRepository;

	@Override
	public List<Nhanvien> getDanhSachNhanVien() {
		return nhanVienRepository.findAll();
	}

	@Override
	public void saveNhanVien(Nhanvien nhanvien) {
		nhanVienRepository.save(nhanvien);
	}

	@Override
	public List<Nhanvien> getNhanVienByKiNang() {
		
		return nhanVienRepository.getNhanVienByKiNang();
	}
}
