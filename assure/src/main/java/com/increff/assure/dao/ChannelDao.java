package com.increff.assure.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.increff.assure.pojo.ChannelPojo;

@Repository
public class ChannelDao extends AbstractDao<ChannelPojo> {

	private static final String SELECT_BY_NAME="select p from ChannelPojo p where p.name=name";
	
	public ChannelPojo selectByName(String name) {
		TypedQuery<ChannelPojo> query=getQuery(SELECT_BY_NAME);
		query.setParameter("name", name);
	    return getSingle(query);
	}
}
