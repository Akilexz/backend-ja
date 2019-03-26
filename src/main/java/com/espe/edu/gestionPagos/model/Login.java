package com.espe.edu.gestionPagos.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@SuppressWarnings("unused")
@Entity
@Table (name="sig_login")
public class Login implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 4886215503807686579L;

@Id
@Column(name="log_usuario",nullable=false)
private Long usuario;

@Column(name="log_pass")
private String contraseña;

/**
 * @return the usuario
 */
public Long getUsuario() {
	return usuario;
}

/**
 * @param usuario the usuario to set
 */
public void setUsuario(Long usuario) {
	this.usuario = usuario;
}

/**
 * @return the contraseña
 */
public String getContraseña() {
	return contraseña;
}

/**
 * @param contraseña the contraseña to set
 */
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Login [usuario=" + usuario + ", contraseña=" + contraseña + "]";
}


}
