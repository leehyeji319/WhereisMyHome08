package com.ssafy.myhome.model.service;

import java.util.List;

import com.ssafy.myhome.model.dto.Board;
import com.ssafy.myhome.model.dto.InterestBoard;

public interface InterestBoardService {
	
	InterestBoard getUserInterestBoard(int interestBoardId);
	List<InterestBoard> getUserInterestBoards(String userId);
	boolean insertUserInterestBoardMapping(String userId, Board board);
	boolean deleteUserInterestBoardMapping(int interestBoardId);

}