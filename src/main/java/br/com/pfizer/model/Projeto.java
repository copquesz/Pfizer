package br.com.pfizer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class Projeto implements Serializable{
	
	private static final long serialVersionUID = -1364351214591483473L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;
	
	private String nomeProjeto;
	
	private String valorProjeto;
	
	private String valorSolicitado;
	
	private Integer beneficiariosDireto;
	
	private Integer beneficiariosIndireto;
	
	private Integer profissionaisEnvolvidos;
	
	@Column(columnDefinition = "TEXT")
	private String objetivo;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "nota_id")
	private Nota nota;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "documentos_projeto_id")
	private DocumentosProjeto documentosProjeto;
	
	@JoinColumn(name = "associacao_id")
	@ManyToOne(fetch = FetchType.EAGER)
	Associacao associacao;
	
	public Projeto() {
		this.dataCadastro = new Date();
	}

}
