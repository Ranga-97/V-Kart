package com.vkart.service;

import java.util.List;

import com.vkart.entity.Dresses;

public interface DressesService {
	public Dresses saveDress(Dresses dresses);
	public Dresses updateDress(Dresses dresses);
	public boolean deleteDress(int id);
	public List<Dresses> getDresses(Dresses dresses);
	public Dresses getbyId(int id,Dresses dresses);
}
