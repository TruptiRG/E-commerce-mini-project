package com.shop.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private String productBrand;
	private Double productMRP;
	private Double productSellingPrice;
	private Integer availableQuntity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;
	
	@ManyToOne
	@JsonIgnore
	private Admin admin;
}
