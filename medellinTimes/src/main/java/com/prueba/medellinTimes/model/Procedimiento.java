package com.prueba.medellinTimes.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "procedimiento")
@Access(AccessType.FIELD)
public class Procedimiento extends ParentEntity{
	
	private static final long serialVersionUID = -7812684859083704105L;

	@Column(name = "titulo", nullable = false, length = 100)
	private String titulo;
	
	@Column(name = "cuerpo", nullable = false, length = 255)
	private String cuerpo;
	
	@Column(name = "comentario", nullable = true, length = 255)
	private String comentario;
	
	@Column(name = "lugar", nullable = true, length = 100)
	private String lugar;
	
	@Column(name = "fecha_publicacion", nullable = false)
	private String fecha_publicacion;
	
	@Column(name = "fecha_vencimiento", nullable = true)
	private String fecha_vencimiento;
	
	/*@Column(name = "usuario_id", nullable = false, length = 255)
	private int usuario_id;*/
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getFecha_publicacion() {
		return fecha_publicacion;
	}
	public void setFecha_publicacion(String fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}
	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	/*public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}*/
}
