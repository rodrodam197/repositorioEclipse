package holaMundo;

import java.util.Scanner;


public class HolaMundo {
	/*
	 * aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	 * bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
	 */
	public void prueba() {

		int num = 0;

		if (1 < num) num++;

	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce algo:");
		String algo=in.nextLine();

		System.out.println("\r\n" + "1. Cambiar el n�mero de espacios de tabulaci�n a 5\n"
				+ "2. En Control Statement en el if-else vamos a seleccionar crear todos los espacios que aparecen\n"
				+ "3. En Comments cambiaremos el valor por defecto para que sean 200 caracteres por l�nea\n"
				+ "4. En Blank Lines, a�adiremos dos nuevas l�neas en blanco despu�s de la declaraci�n de los import\n"
				+ "5. Guarda los cambios y aplica tu estilo\n");

	}

}
