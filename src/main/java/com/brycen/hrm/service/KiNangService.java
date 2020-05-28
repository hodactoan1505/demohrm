package com.brycen.hrm.service;

import java.util.List;
import java.util.Optional;

import com.brycen.hrm.model.KiNang;

public interface KiNangService {
	List<KiNang> getKiNang();
	Optional<KiNang> findKiNang(int id);
}
