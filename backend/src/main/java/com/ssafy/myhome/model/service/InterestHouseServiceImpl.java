package com.ssafy.myhome.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.myhome.model.dao.InterestHouseDao;
import com.ssafy.myhome.model.dto.InterestHouse;

@Service
public class InterestHouseServiceImpl implements InterestHouseService {

	@Autowired
	private InterestHouseDao interestHouseDao;
	
	@Override
	public InterestHouse getUserInterestHouse(int interestHouseId) {
		return interestHouseDao.getUserInterestHouse(interestHouseId);
	}

	@Override
	public List<InterestHouse> getUserInterestHouses(String userId) {
		return interestHouseDao.getUserInterestHouses(userId);

	}
	
	@Override
	public boolean registerUserInterestHouseMapping(Map<String, Object> map) {
		return interestHouseDao.registerUserInterestHouseMapping(map) > 0;
	}

	@Override
	public boolean deleteUserInterestHouseMapping(int interestHouseId) {
		return interestHouseDao.deleteUserInterestHouseMapping(interestHouseId) > 0;
	}
	
}
