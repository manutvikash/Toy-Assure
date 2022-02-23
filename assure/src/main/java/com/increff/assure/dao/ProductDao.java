package com.increff.assure.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.increff.assure.pojo.ProductPojo;

@Repository
public class ProductDao extends AbstractDao<ProductPojo>{

	private static final String SELECT_BY_CLIENTID_CLIENTSKUID="select p from ProductPojo p where p.clientId=:clientId and p.type=:clientSkuId";
	private static final String SELECT_BY_CLIENTID="select p from ProductPojo p where p.clientId=:clientId";
	
	
	  public ProductPojo selectByClientIdAndClientSkuId(Long clientId, String clientSkuId) {
	        TypedQuery<ProductPojo> query = getQuery(SELECT_BY_CLIENTID_CLIENTSKUID);
	        query.setParameter("clientId", clientId);
	        query.setParameter("clientSkuId", clientSkuId);
	        return getSingle(query);
	    }

	    public List<ProductPojo> selectByClientId(Long clientId)
	    {
	        TypedQuery<ProductPojo> query = getQuery(SELECT_BY_CLIENTID);
	        query.setParameter("clientId", clientId);
	        return query.getResultList();
	    }
	
}
