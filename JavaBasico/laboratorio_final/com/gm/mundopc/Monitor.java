package com.gm.mundopc;

public class Monitor {
	
	private int idMonitor;
	private String marca;
	private double tamaño;
	private int contadorMonitores;
	
	private Monitor() {
		this.idMonitor = ++contadorMonitores;
	}
	
	public Monitor(String marca, double tamaño) {
		this();
		this.marca = marca;
		this.tamaño = tamaño;
	}

	public int getIdMonitor() {
		return idMonitor;
	}

	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamaño + "]";
	}
	
	

}
