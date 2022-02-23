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

import com.increff.assure.model.MemberType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
       name="assure_member",indexes=@Index(name="member_type", columnList="name, type",unique=true)		
)
@Getter @Setter
public class MemberPojo extends AbstractPojo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private MemberType type;
	
}
