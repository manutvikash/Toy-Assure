package com.increff.assure.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.increff.assure.pojo.InventoryPojo;

@Repository
public class InventoryDao extends AbstractDao<InventoryPojo>{

	private static final String SELECT_GLOBALSKUID="select p from InventoryPojo p where p.globalSkuId=:globalSkuId";
	
	public InventoryPojo getInventoryByGlobalSkuId(Long globalSkuId) {
		TypedQuery<InventoryPojo> query=getQuery(SELECT_GLOBALSKUID);
		query.setParameter("globalSkuId", globalSkuId);
		return query.getSingleResult();
	}
}
