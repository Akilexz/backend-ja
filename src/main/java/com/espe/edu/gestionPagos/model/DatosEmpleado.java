package com.espe.edu.gestionPagos.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sig_datos_empleados")
public class DatosEmpleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8905374584710838458L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="datemp_c_i", nullable=false)
private Long tempCi;

@NotNull
@ManyToOne
@JoinColumn(name=" log_usuario")
private Login login;


@Column(name="datemp_nombre")
private String datempNombre;

@Column(name="datemp_cargo")
private String dateCargo;

@Column(name=" datemp_orden_costos")
private int ordenCostos;

@Column(name="datemp_responsable")
private String datempResponsable;

@Column(name=" datemp_fecha_hora_ini ")
private Timestamp fechaHoraIni;

@Column(name="datemp_fecha_hora_fin")
private Timestamp fechaHoraFin;


@Column(name="datemp_correo")
private String correo;

@Column(name="datemp_usuario_crea ")
private String  creacion; 

@Column(name="datemp_emp_modificacion ")
private String modificar;

@Column(name="datemp_fecha_modi ")
private Timestamp fechaModificacion;

/**
 * @return the tempCi
 */
public Long getTempCi() {
	return tempCi;
}

/**
 * @param tempCi the tempCi to set
 */
public void setTempCi(Long tempCi) {
	this.tempCi = tempCi;
}

/**
 * @return the login
 */
public Login getLogin() {
	return login;
}

/**
 * @param login the login to set
 */
public void setLogin(Login login) {
	this.login = login;
}

/**
 * @return the datempNombre
 */
public String getDatempNombre() {
	return datempNombre;
}

/**
 * @param datempNombre the datempNombre to set
 */
public void setDatempNombre(String datempNombre) {
	this.datempNombre = datempNombre;
}

/**
 * @return the dateCargo
 */
public String getDateCargo() {
	return dateCargo;
}

/**
 * @param dateCargo the dateCargo to set
 */
public void setDateCargo(String dateCargo) {
	this.dateCargo = dateCargo;
}

/**
 * @return the ordenCostos
 */
public int getOrdenCostos() {
	return ordenCostos;
}

/**
 * @param ordenCostos the ordenCostos to set
 */
public void setOrdenCostos(int ordenCostos) {
	this.ordenCostos = ordenCostos;
}

/**
 * @return the datempResponsable
 */
public String getDatempResponsable() {
	return datempResponsable;
}

/**
 * @param datempResponsable the datempResponsable to set
 */
public void setDatempResponsable(String datempResponsable) {
	this.datempResponsable = datempResponsable;
}

/**
 * @return the fechaHoraIni
 */
public Timestamp getFechaHoraIni() {
	return fechaHoraIni;
}

/**
 * @param fechaHoraIni the fechaHoraIni to set
 */
public void setFechaHoraIni(Timestamp fechaHoraIni) {
	this.fechaHoraIni = fechaHoraIni;
}

/**
 * @return the fechaHoraFin
 */
public Timestamp getFechaHoraFin() {
	return fechaHoraFin;
}

/**
 * @param fechaHoraFin the fechaHoraFin to set
 */
public void setFechaHoraFin(Timestamp fechaHoraFin) {
	this.fechaHoraFin = fechaHoraFin;
}

/**
 * @return the correo
 */
public String getCorreo() {
	return correo;
}

/**
 * @param correo the correo to set
 */
public void setCorreo(String correo) {
	this.correo = correo;
}

/**
 * @return the creacion
 */
public String getCreacion() {
	return creacion;
}

/**
 * @param creacion the creacion to set
 */
public void setCreacion(String creacion) {
	this.creacion = creacion;
}

/**
 * @return the modificar
 */
public String getModificar() {
	return modificar;
}

/**
 * @param modificar the modificar to set
 */
public void setModificar(String modificar) {
	this.modificar = modificar;
}

/**
 * @return the fechaModificacion
 */
public Timestamp getFechaModificacion() {
	return fechaModificacion;
}

/**
 * @param fechaModificacion the fechaModificacion to set
 */
public void setFechaModificacion(Timestamp fechaModificacion) {
	this.fechaModificacion = fechaModificacion;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "DatosEmpleado [tempCi=" + tempCi + ", login=" + login + ", datempNombre=" + datempNombre + ", dateCargo="
			+ dateCargo + ", ordenCostos=" + ordenCostos + ", datempResponsable=" + datempResponsable
			+ ", fechaHoraIni=" + fechaHoraIni + ", fechaHoraFin=" + fechaHoraFin + ", correo=" + correo + ", creacion="
			+ creacion + ", modificar=" + modificar + ", fechaModificacion=" + fechaModificacion + "]";
}


}