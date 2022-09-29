package com.vkart.service;

import java.util.List;

import com.vkart.entity.Gifts;

public interface GiftService {
	public Gifts saveGift(Gifts gifts);
	public Gifts updateGift(Gifts gifts);
	public boolean deleteGift(int id);
	public List<Gifts> getGifts();
	public Gifts getbyId(int id,Gifts gifts);
}
