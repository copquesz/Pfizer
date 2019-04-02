package br.com.pfizer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.pfizer.enumerated.Sexo;
import br.com.pfizer.enumerated.TipoUsuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 7243225367592107901L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	private Date ultimoAcesso;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	private String email;

	private String senha;

	private String telefone;

	private String cpf;

	@Enumerated(EnumType.ORDINAL)
	private Sexo sexo;

	@Enumerated(EnumType.ORDINAL)
	private TipoUsuario tipo;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco_id")
	Endereco endereco;
	
	public Usuario() {
		this.dataCadastro = new Date();
	}

}
