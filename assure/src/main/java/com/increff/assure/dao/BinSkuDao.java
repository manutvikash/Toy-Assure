package com.increff.assure.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BinSkuDao extends AbstractDao {

	private static final String SELECT_BINID_GLOBALSKUID="select b from BinSkuPojo b where b.binId=:binId and b.globalSkuId=:globalSkuId";
//	private static final String SELECT_
}
