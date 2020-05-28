package com.brycen.hrm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brycen.hrm.model.KiNang;
import com.brycen.hrm.model.Nhanvien;
import com.brycen.hrm.service.KiNangService;
import com.brycen.hrm.service.NhanVienService;

@RestController
public class HomeController {
	
	@Autowired
	KiNangService kiNangService;
	@Autowired
	NhanVienService nhanVienService;
	
	@PostMapping("/employee/add")
	public String addNhanVien(
			@RequestParam("hoTen") String hoten, 
			@RequestParam("diaChi") String diachi, 
			@RequestParam("sk1") int sk1,
			@RequestParam("sk2") int sk2) {
		
		Optional<KiNang> kn1 = kiNangService.findKiNang(sk1);
		Optional<KiNang> kn2 = kiNangService.findKiNang(sk2);
		
		KiNang a1 = kn1.get();
		KiNang a2 = kn2.get();
		List<KiNang> lst = new ArrayList<KiNang>();
		lst.add(a1);
		lst.add(a2);
		
		Nhanvien nv = new Nhanvien(hoten, diachi, lst);
		nhanVienService.saveNhanVien(nv);
		return "done";
	}
	
	@GetMapping("/")
	public List<Nhanvien> home() {	
		return nhanVienService.getDanhSachNhanVien();
	}
	
	@GetMapping("/skill")
	public List<KiNang> skill() {
		return kiNangService.getKiNang();
	}
	
	
	@GetMapping("/nhanvien")
	public List<Nhanvien> danhsach() {
		return nhanVienService.getNhanVienByKiNang();
	}
}
