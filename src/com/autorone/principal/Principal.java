package com.autorone.principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.autozone.enums.Category;
import com.autozone.models.Clothing;
import com.autozone.models.Electronic;
import com.autozone.models.Grocery;
import com.autozone.models.RetailStore;

public class Principal {

	public static void main(String[] args) {
		RetailStore store = new RetailStore();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			try {
				System.out.println("\nSistema de gestión de Venta Minorista");
				System.out.println("\nSelecciona un número válido");
				System.out.println("1. Agrega producto");
				System.out.println("2. Muestra todos los productos");
				System.out.println("3. Busca un producto");
				System.out.println("4. Elimina un producto");
				System.out.println("5. Salir");
				
				int choice = scanner.nextInt();
				scanner.nextLine();
				
				switch (choice) {
				case 1:
					addProductInteraction(store, scanner);
					break;
				case 2:
					store.displayAllProducts();
					break;
				case 3:
					System.out.println("Ingresa el nombre del producto que quieres buscar: ");
					String searchName = scanner.nextLine();
					store.searchProduct(searchName);
					break;
				case 4:
					System.out.println("Ingresa el nombre del producto que quieres eliminar: ");
					String removeName = scanner.nextLine();
					store.removeProduct(removeName);
					break;
				case 5:
					running = false;
					break;
				default:
					System.out.println("Selección incorrecta, por fvor intentálo de nuevo");
					break;
				}
			} catch (InputMismatchException exception) {
				System.out.println("La entrada no es válida, por favor ingresa un número válido");
				scanner.nextLine();
			}
		}
		
		scanner.close();
		
	}
	
	private static void addProductInteraction(RetailStore store, Scanner scanner) {
		try {
			System.out.println("Selecciona el número de una categoría");
			System.out.println("1. Electronica");
			System.out.println("2. Ropa");
			System.out.println("3. Consumibles");
			
			int categoryChoice = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Ingresa el nombre del producto");
			String name = scanner.nextLine();
			System.out.println("Ingresa el precio del producto");
			double price = scanner.nextDouble();
			scanner.nextLine();
			
			switch (categoryChoice) {
			case 1:
				System.out.println("Ingresa la marca: ");
				String brand = scanner.nextLine();
				System.out.println("Ingresa la garantía (meses): ");
				int warranty = scanner.nextInt();
				scanner.nextLine();
				
				store.addProduct(new Electronic(name, price, Category.ELECTRONICS, 
						brand, warranty));
				break;
			case 2:
				System.out.println("Ingresa el tamaño: ");
				String size = scanner.nextLine();
				System.out.println("Ingresa el material: ");
				String material = scanner.nextLine();
				
				store.addProduct(new Clothing(name, price, Category.CLOTHING, size, material));
				break;
			case 3:
				System.out.println("Ingresa el peso (kg): ");
				double weight = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Ingresa la fecha de expiración (YYYY-MM-DD): ");
				String expirationDate = scanner.nextLine();
				
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date expirationDateFormat = simpleDateFormat.parse(expirationDate);
				
				store.addProduct(new Grocery(name, price, Category.GROCERY, weight, 
						expirationDateFormat));
				break;
			default:
				System.out.println("Selección de categoría inválida");
			}
		} catch (InputMismatchException exception) {
			System.out.println("Entrada inválida, Por favor selecciona un número válido");
		} catch (ParseException exception) {
			System.out.println("El formato de la fecha no es correcto");
		}
	}

}
