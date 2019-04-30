package herencia;

import java.util.Date;

public class Cliente extends Persona {
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	public Cliente(Date fechaRegistro, boolean vip) {
		this.idCliente = ++contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]";
	}
	
	

}
