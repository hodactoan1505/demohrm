package com.brycen.hrm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class KiNang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idKiNang;
	private String tenKiNang;
	
	@ManyToMany(mappedBy = "lstkiNang", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Nhanvien> lstNhanVien;

	public KiNang() {}
		
	
	public KiNang(String tenKiNang, List<Nhanvien> lstNhanVien) {
		this.tenKiNang = tenKiNang;
		this.lstNhanVien = lstNhanVien;
	}

	public String getTenKiNang() {
		return tenKiNang;
	}

	public void setTenKiNang(String tenKiNang) {
		this.tenKiNang = tenKiNang;
	}

	public List<Nhanvien> getLstNhanVien() {
		return lstNhanVien;
	}

	public void setLstNhanVien(List<Nhanvien> lstNhanVien) {
		this.lstNhanVien = lstNhanVien;
	}

	public int getIdKiNang() {
		return idKiNang;
	}
	
	
}
