package com.increff.assure.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="assure_order_item")
@Getter @Setter
public class OrderItemPojo extends AbstractPojo{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private Long orderId;
	@NotNull
	private Long globalSkuId;
	@NotNull
	private Long orderedQuantity;
	@NotNull
	private Long allocatedQuantity;
	@NotNull
	private Long fulfilledQuantity;
	@NotNull
	private Double sellingPricePerUnit;
}
