package com.increff.assure.pojo;

import javax.persistence.Column;
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
@Table(
       name="assure_product",indexes=@Index(name="client_id_sku", columnList="clientId, clientSkuId",unique=true)		
)
@Getter @Setter
public class ProductPojo extends AbstractPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long globalSkuId;
	
	@NotNull
	private String clientSkuId;
	
	@NotNull
	private Long clientId;
	
	@NotNull
	private String name;
	
	@NotNull
	private String brandId;
	
	@NotNull
	private Double mrp;
	
	@NotNull
	@Column(name="description")
	private String desc;
	
}
