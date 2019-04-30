package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPc {

	public static void main(String[] args) {
		Raton raton= new Raton("usb", "corsair");
		Teclado teclado = new Teclado("usb", "genius");
		Monitor monitor = new Monitor("samsung", 27);
		Computadora computadora1 = new Computadora("portatil", monitor, teclado, raton, 43);
		Computadora computadora2 = new Computadora("escritorio", monitor, teclado, raton, 35);
		Orden orden = new Orden();
		
		orden.agregarComputadora(computadora1);
		orden.agregarComputadora(computadora2);
		
		orden.mostrarOrden();
	}

}
