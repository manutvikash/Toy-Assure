package com.increff.assure.pojo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass @Getter @Setter
public abstract class AbstractPojo {

	@CreationTimestamp
	@Column(updatable=false)
	private LocalDateTime created_at;
	
	@UpdateTimestamp
	private LocalDateTime updated_at;
	
	@Version
	@Column(name="VERSION")
	private Long version;
}
