package ejercicio_5;

import java.util.Scanner;
import java.util.ArrayList;
import ejercicio_1.Helper;

public class Principal {
	
	public static char[] cargarArray(Scanner input, int longitud) {
		char[] arrayCaracter = new char[longitud];
		for (int i = 0; i < longitud; i++) {
			arrayCaracter[i] = Helper.validarCaracter(input, "Ingrese un caracter: ");
		}
		return arrayCaracter;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] array1 = cargarArray(input, Helper.validarEntero(input, "Ingrese la longitud del array 1: "));
		char[] array2 = cargarArray(input, Helper.validarEntero(input, "Ingrese la longitud del array 2: "));
		
		ArrayChar arrayChar = new ArrayChar(array1, array2);
		ArrayList<Character> resultado = arrayChar.encontrarInterseccion();
		System.out.println("Resultado: "+resultado);
	}
}
