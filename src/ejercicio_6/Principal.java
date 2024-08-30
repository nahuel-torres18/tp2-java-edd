package ejercicio_6;

import java.util.Random;
import java.util.Scanner;
import ejercicio_1.Helper;

public class Principal {
	
	public static int[][] cargarMatriz(int[][] matrizNumeros, Random random) {
		for (int i = 0; i < matrizNumeros.length; i++) {
			for (int j = 0; j < matrizNumeros[i].length; j++) {
				matrizNumeros[i][j] = random.nextInt(100)+1;
			}
		}
		return matrizNumeros;
	}
	
	public static void mostrar(int[][] matrizNumeros) {
		for (int[] fila : matrizNumeros) {
			for (int columna : fila) {
				System.out.print(columna + " ");
			}
			System.out.println();
		}
	}
	
	public static String encontarPosicionNumero(int numero, int[][] matrizNumeros) {
		for (int i = 0; i < matrizNumeros.length; i++) {
			for (int j = 0; j < matrizNumeros[i].length; j++) {
				if (numero == matrizNumeros[i][j]) {
					return "Numero encontrado en la posicion (" + i + "," + j +")";
				}
			}
		}
		return "Numero no encontrado";
	}
	
	public static String buscarLado(int fila, int columna, String direccion, int[][] matriz) {
		if (direccion.equalsIgnoreCase("izquierda")) {
			if (columna > 0) {
				return "Numeros a la izquierda " + matriz[fila][columna-1]; 
			} else {
				return "No hay numeros a la izquierda de la posicion indicada";
			}
		} else if (direccion.equalsIgnoreCase("derecha")) {
			if (columna > columna-1) {
				return "Numeros a la derecha " + matriz[fila][columna+1];
			} else {
				return "No hay numeros a la derecha de la posicion indicada";
			}
		} else {
			return "Direccion no valida. Use 'izquierda' o 'derecha'";
		}
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		int[][] arrayNumeros = new int[Helper.validarEntero(input, "Ingrese el tamaño de la fila M: ")][Helper.validarEntero(input, "Ingrese el tamaño de la columna N: ")];
		
		arrayNumeros = cargarMatriz(arrayNumeros, random);
		mostrar(arrayNumeros);
		System.out.println(encontarPosicionNumero(Helper.validarEntero(input, "Ingrese el numero que quiere saber su posicion: "), arrayNumeros));
		int fila = Helper.validarEntero(input, "Ingrese la fila a buscar: ");
		int columna = Helper.validarEntero(input,"Ingrese la columna a buscar: ");
		System.out.println(buscarLado(fila, columna , Helper.leerCadena(input, "Ingrese la direccion (izquierda/derecha): "), arrayNumeros));
	}
}
