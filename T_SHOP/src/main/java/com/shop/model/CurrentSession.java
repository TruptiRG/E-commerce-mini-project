package com.shop.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentSession {
	
	@Id
	@Column(unique = true)
	private Integer id;
	private String email;
	private String role;
	private String key;
	private LocalDateTime localDateTime;
	

}
