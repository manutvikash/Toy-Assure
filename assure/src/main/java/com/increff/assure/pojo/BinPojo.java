package com.increff.assure.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="assure_bin")
@Getter @Setter
public class BinPojo extends AbstractPojo {

	@TableGenerator(name="bin", pkColumnValue="bin",initialValue=1000)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,generator="bin")
	private Long binId;
}
