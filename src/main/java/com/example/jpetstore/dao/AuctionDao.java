package com.example.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.domain.Order;

public interface AuctionDao {
	/*
	 * ������������ ���� ��������(getAuctionListByUserId)
	 * ���ǿ��� ������db���� ���� ����
	 * insert, update, (delete), 
	 *  
	 *  
	 *  */
	 List<Auction> getAuctionByUsername(String username) throws DataAccessException;
	 void updateBiddingPrice(double price)throws DataAccessException;
	 void insertAuction(Auction auction)throws DataAccessException;
	void deleteAuctionbyAuctionId(String auctionId) throws DataAccessException;
}
