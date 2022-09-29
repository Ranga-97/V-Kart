package com.vkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vkart.entity.Dresses;
@Repository
public interface DressesDao extends JpaRepository<Dresses, Integer> {

}
