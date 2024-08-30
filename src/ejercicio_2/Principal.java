package ejercicio_2;

import ejercicio_1.Helper;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AdministradorDeListas administradorDeListas = new AdministradorDeListas();
		
		administradorDeListas.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		administradorDeListas.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		administradorDeListas.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		administradorDeListas.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		administradorDeListas.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		administradorDeListas.añadirElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		
		administradorDeListas.eliminarElemento(Helper.leerCadena(input, "Ingrese el texto que quiere eliminar: "));
		administradorDeListas.eliminarElemento(Helper.leerCadena(input, "Ingrese un texto: "));
		
		administradorDeListas.buscarElemento(Helper.leerCadena(input, "Ingrese el texto que quiere buscar: "));
		
		administradorDeListas.mostrarElementos();
	}
}
