package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="JPA_JOBSEEKER")
public class JobSeeker {
	@Id
	@GeneratedValue
	private Integer jsId;
	@Column(length=30)
    private String jsName;	
	@Column(length=30)
	private String jsAddrs;
	@Column(length=30)
	private String qlfy;
	private Double expectedSalary;
	
}
