package com.increff.assure.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.increff.assure.model.MemberType;
import com.increff.assure.pojo.MemberPojo;


@Repository
public class MemberDao extends AbstractDao<MemberPojo>{

	private static final String SELECT_NAME_TYPE="select m from MemberPojo m where m.name=:name and m.type=:type";
	private static final String SELECT_TYPE="select m from MemberPojo m where m.type=:type";
	
	public MemberPojo selectBrandCategory(String name, MemberType type ) {
		TypedQuery<MemberPojo> query = getQuery(SELECT_NAME_TYPE);
		query.setParameter("name", name);
		query.setParameter("type", type);
		return getSingle(query);
	}
	
	
	public List<MemberPojo> selectAllByType(MemberType type){
		TypedQuery<MemberPojo> query=getQuery(SELECT_TYPE);
		query.setParameter("type", type);
		return query.getResultList();
	}
	
	
}
