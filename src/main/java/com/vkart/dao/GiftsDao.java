package com.vkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vkart.entity.Gifts;
@Repository
public interface GiftsDao extends JpaRepository<Gifts, Integer> {

}
