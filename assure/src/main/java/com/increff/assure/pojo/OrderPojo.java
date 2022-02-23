package com.increff.assure.pojo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.increff.assure.model.OrderType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="assure_order", indexes=@Index(name="channel_Id_OrderId",columnList="channelId,channelOrderId",unique=true))
public class OrderPojo extends AbstractPojo{

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @NotNull
	 private Long clientId;
	 @NotNull
	 private Long channelId;
	 @NotNull
	 private Long customerId;
	 @NotNull
	 private String channelOrderId;
	 
	 @NotNull
	 @Enumerated(value=EnumType.STRING)
	 private OrderType status;
}
