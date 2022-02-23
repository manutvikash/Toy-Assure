package com.increff.assure.dao;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.increff.assure.pojo.ChannelListingPojo;

@Repository
public class ChannelListingDao extends AbstractDao<ChannelListingPojo> {

	private static final String SELECT_BY_CHANNELID_CHANNELSKUID_CLIENTID="select p from ChannelListingPojo p where p.channelId=:channelId and p.channelSkuId=:channelSkuId and p.clientId=:clientId";
	private static final String SELECT_BY_CHANNELID_GLOBALSKUID="select p from ChannelListingPojo p where p.globalSkuId=:globalSkuId and p.channelId=:channelId";
	
	public ChannelListingPojo selectByChannelSKuIdAndClientId(String channelSkuId, Long channelId, Long clientId) {
		TypedQuery<ChannelListingPojo> query=getQuery(SELECT_BY_CHANNELID_CHANNELSKUID_CLIENTID);
		query.setParameter("channelSkuId", channelSkuId);
		query.setParameter("channelId", channelId);
		query.setParameter("clientId", clientId);
		return getSingle(query);
	}
	
	public ChannelListingPojo selectByChannelIdAndGlobalSkuId(Long channelId,Long globalSkuId) {
		TypedQuery<ChannelListingPojo> query=getQuery(SELECT_BY_CHANNELID_GLOBALSKUID);
		query.setParameter("globalSkuId", globalSkuId);
		query.setParameter("channelId", channelId);
		return getSingle(query);
	}
}
