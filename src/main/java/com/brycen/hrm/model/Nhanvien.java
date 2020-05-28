package com.brycen.hrm.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Nhanvien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNhanVien;
	private String hoTen;
	private String diaChi;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "KiNangNhanVien", joinColumns = @JoinColumn(name = "idNhanVien"), inverseJoinColumns = @JoinColumn(name = "idKiNang"))
	private List<KiNang> lstkiNang;

	
	public Nhanvien() {}
	
		
	public Nhanvien(String hoTen, String diaChi, List<KiNang> lstkiNang) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.lstkiNang = lstkiNang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public List<KiNang> getLstkiNang() {
		return lstkiNang;
	}

	public void setLstkiNang(List<KiNang> lstkiNang) {
		this.lstkiNang = lstkiNang;
	}

	public int getIdNhanVien() {
		return idNhanVien;
	}
	
	
	
}
