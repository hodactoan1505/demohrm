package com.brycen.hrm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brycen.hrm.model.KiNang;
import com.brycen.hrm.repository.KiNangRepository;
import com.brycen.hrm.service.KiNangService;

@Service
public class KiNangServiceImpl implements KiNangService{
	
	@Autowired
	KiNangRepository kiNangRepository;

	@Override
	public List<KiNang> getKiNang() {
		return kiNangRepository.findAll();
	}

	@Override
	public Optional<KiNang> findKiNang(int id) {
		return kiNangRepository.findById(id);
	}
	
	
}
