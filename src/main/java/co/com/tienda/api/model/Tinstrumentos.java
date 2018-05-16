package co.com.tienda.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tinstrumentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String codigo;

	private String marca;

	private String modelo;

	private String tipoInstrumento;

	private int precio;

	private int garantia;

	private String paisProcedencia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public String getPaisProcedencia() {
		return paisProcedencia;
	}

	public void setPaisProcedencia(String paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}

}
