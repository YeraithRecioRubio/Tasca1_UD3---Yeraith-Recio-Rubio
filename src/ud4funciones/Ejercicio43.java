package ud4funciones;

public class Ejercicio43 {
	static void dibujarRectangulo(int ancho, int alto) {

		//añadimos condición para que si ancho/alto <=0 lance mensaje de error//
		if (ancho <= 0 || alto <= 0) {
			System.out.println("Error: El ancho y el alto deben ser números positivos.");
			return; //para salir del método si hay un error//
		}

		//si los valores son válidos ejecutará el dibujo del rectangulo//
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		dibujarRectangulo(-5, 8);
	}
}
