package com.realife.services.domains;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseDomain {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	@Length(max = 50)
	private String firstName;
	
	@Length(max = 50)
	private String lastName;
	
	@NotBlank
	@Length(max = 255)
	private String email;
	
	@NotBlank
	@Length(max = 255)
	private String passwordDigest;
	
	@Length(max = 255)
	private String rememberDigest;
	
	@NotNull
	private Date createdAt;
	
	private Date updatedAt;
}
