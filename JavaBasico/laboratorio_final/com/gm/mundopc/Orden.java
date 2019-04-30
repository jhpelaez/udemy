package com.gm.mundopc;

public class Orden {
	private int idOrden;
	private Computadora[] computadoras;
	private static int contadorOrdenes;
	private int contadorComputadoras;
	private static final int MAX_COMPUTADORAS = 10;
	
	public Orden() {
		this.idOrden = ++contadorOrdenes;
		computadoras = new Computadora[MAX_COMPUTADORAS];
	}
	
	public void agregarComputadora(Computadora computadora) {
		if (contadorComputadoras < MAX_COMPUTADORAS)
			this.computadoras[contadorComputadoras++] = computadora;
		else 
			System.out.println("Se supero el maximo de computadoras: "+ MAX_COMPUTADORAS);
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for(int i=0; i<contadorComputadoras; i++)
			total += computadoras[i].getPrecio();
		return total;
	}
	
	public void mostrarOrden() {
		System.out.println("Orden # "+idOrden);
		System.out.println("Total de la orde: $"+calcularTotal());
		System.out.println("Productos en la orden:");
		for(int i=0; i<contadorComputadoras; i++)
			System.out.println(computadoras[i]);
	}
}
