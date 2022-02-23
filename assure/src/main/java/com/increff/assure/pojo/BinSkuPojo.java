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
@Table(name="assure_bin_sku",indexes=@Index(name="bin_global_sku_id",columnList="binId,globalSkuId",unique=true))
@Getter @Setter
public class BinSkuPojo extends AbstractPojo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private Long globalSkuId;
	
	@NotNull
	private Long quantity;
}
