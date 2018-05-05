package main;

import java.util.ArrayList;
import java.util.Scanner;

import datos.Paquete;
import datos.Sucursal;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Paquete> lista = new ArrayList<Paquete>();
		
		int num = 0;
		
		do {
			
			try {
				System.out.println("Dime el número de la sucursal");
				String a = sc.next();
				num = Integer.parseInt(a);
				
			} catch (Exception e) {
				System.out.println("No has metido un número");
			}
		
		}while(num == 0);
		
		System.out.println("Dime la dirección de la sucursal");
		String direccion = sc.next();
		
		System.out.println("Dime la cuidad de la sucursal");
		String cuidad = sc.next();
		
		Sucursal s1 = new Sucursal(num, direccion, cuidad);
		
		String respuesta = "";
		do {
			System.out.println("¿Quieres enviar un paquete?");
			respuesta = sc.next();
			
			if(respuesta.equalsIgnoreCase("si")) {
				int numRef = 0;
				do {
					try {
					System.out.println("Dígame el número de referencia");
					numRef = sc.nextInt();
					}catch (Exception e) {
						System.out.println("No has introducido un número");
					}
				}while(numRef == 0);
					
				System.out.println("Dígame su DNI:");
				String dni = sc.next();
				
				double peso = 0;
				do {
					try {
						System.out.println("Dígame el peso:");
						peso = sc.nextDouble();
					} catch (Exception e) {
						System.out.println("No has introducido un número");
					}
				}while(peso == 0);
				
				System.out.println("¿Qué tipo de prioridad desea? [Alta=10euros] [Expres=20euros]");
				String prioridad = sc.next();
				
				Paquete p1 =new Paquete(numRef, dni, peso, prioridad);
				lista.add(p1);
				System.out.println("El precio de tu paquete es");
				System.out.println(s1.calcularPaquete(p1));
			}
				
		}while(respuesta.equalsIgnoreCase("si"));
		
		System.out.println("Listado de paquetes");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
			System.out.println("El precio del paquete es");
			System.out.println(s1.calcularPaquete(lista.get(i)));
		}
		
		sc.close();
		

	}

}
