package com.vkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkart.dao.GiftsDao;
import com.vkart.entity.Gifts;
@Service
public class GiftServiceImp implements GiftService {
	@Autowired
	private GiftsDao giftsDao;
	@Override
	public Gifts saveGift(Gifts gifts) {

		return giftsDao.save(gifts);
	}

	@Override
	public Gifts updateGift(Gifts gifts) {
	
		return giftsDao.save(gifts);
	}

	@Override
	public boolean deleteGift(int id) {
		giftsDao.deleteById(id);;
		return true;
	}

	@Override
	public List<Gifts> getGifts() {
		
		return giftsDao.findAll();
	}

	@Override
	public Gifts getbyId(int id, Gifts gifts) {
		
		return giftsDao.findById(id).get();
	}

}
