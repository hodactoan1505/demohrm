package com.brycen.hrm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.brycen.hrm.model.Nhanvien;

public interface NhanVienRepository extends JpaRepository<Nhanvien, Integer>{
    @Query(value = "SELECT e.* FROM nhanvien e, ki_nang_nhan_vien ee, ki_nang eee Where e.id_nhan_vien = ee.id_nhan_vien and ee.id_ki_nang = eee.id_ki_nang and eee.ten_ki_nang = 'C++'", nativeQuery = true)
	List<Nhanvien> getNhanVienByKiNang();
}
