package ejercicio_5;

import java.util.ArrayList;

public class ArrayChar {
	private char[] array1;
	private char[] array2;
	
	public ArrayChar(char[] array1, char[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}
	
	public ArrayList<Character> encontrarInterseccion() {
		ArrayList<Character> inteseccion = new ArrayList<Character>();
		for (char c1 : array1) {
			for (char c2 : array2) {
				if (c1 == c2 && !inteseccion.contains(c1)) {
					inteseccion.add(c1);
				}
			}
		}
		return inteseccion;
	}
}
