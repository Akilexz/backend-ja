package com.espe.edu.gestionPagos.model;

import java.io.Serializable;
//import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sig_historial_empleado")
public class HistorialEmpleado implements Serializable {

	


/**
	 * 
	 */
	private static final long serialVersionUID = 8749383183007601847L;

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY) 
@Column(name="detemp_id_emp", nullable=false)
private Long tempIdEmp;

@NotNull
@ManyToOne 
@JoinColumn(name="datemp_c_i ")
private DatosEmpleado datosEmpleado;


@Column(name=" detemp_modificacion")
private String modificacion;


/**
 * @return the tempIdEmp
 */
public Long getTempIdEmp() {
	return tempIdEmp;
}


/**
 * @param tempIdEmp the tempIdEmp to set
 */
public void setTempIdEmp(Long tempIdEmp) {
	this.tempIdEmp = tempIdEmp;
}


/**
 * @return the datosEmpleado
 */
public DatosEmpleado getDatosEmpleado() {
	return datosEmpleado;
}


/**
 * @param datosEmpleado the datosEmpleado to set
 */
public void setDatosEmpleado(DatosEmpleado datosEmpleado) {
	this.datosEmpleado = datosEmpleado;
}


/**
 * @return the modificacion
 */
public String getModificacion() {
	return modificacion;
}


/**
 * @param modificacion the modificacion to set
 */
public void setModificacion(String modificacion) {
	this.modificacion = modificacion;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "HistorialEmpleado [tempIdEmp=" + tempIdEmp + ", datosEmpleado=" + datosEmpleado + ", modificacion="
			+ modificacion + "]";
}



}