package br.com.pfizer.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class RedesSociais implements Serializable {

	private static final long serialVersionUID = -3449526127232948639L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	private String website;

	@Column(columnDefinition = "TEXT")
	private String facebook;

	private Integer seguidoresFacebook;

	@Column(columnDefinition = "TEXT")
	private String instagram;
	
	private Integer seguidoresInstagram;

}
