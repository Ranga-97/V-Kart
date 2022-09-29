package com.vkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkart.dao.DressesDao;
import com.vkart.entity.Dresses;
@Service
public class DressesServiceImp implements DressesService {
	@Autowired
	private DressesDao dressesdao;
	@Override
	public Dresses saveDress(Dresses dresses) {
		
		return dressesdao.save(dresses) ;
	}

	@Override
	public Dresses updateDress(Dresses dresses) {
	
		return dressesdao.save(dresses);
	}

	@Override
	public boolean deleteDress(int id) {
	dressesdao.deleteById(id);
		return true;
	}

	@Override
	public List<Dresses> getDresses(Dresses dresses) {
	
		return dressesdao.findAll();
	}

	@Override
	public Dresses getbyId(int id, Dresses dresses) {
		
		return dressesdao.findById(id).get();
	}

}
