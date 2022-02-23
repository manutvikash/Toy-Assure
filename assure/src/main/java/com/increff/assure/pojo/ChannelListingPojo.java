package com.increff.assure.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="assure_channel_listing",indexes = @Index(name="channel_listing",columnList = "channelId,channelSkuId,clientId",unique = true))
@Getter @Setter
public class ChannelListingPojo extends AbstractPojo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Long channelId;
	@NotNull
	private String channelSkuId;
	@NotNull
	private Long clientId;
	@NotNull
	private Long globalSkuId;
	
}
