package PRODUCT;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product_Manager productManager = new Product_Manager();

		
		Category electronicsCategory = new Category("Điện tử");
		Category clothingCategory = new Category("Quần Áo");
		Category foodCategory = new Category("Thực phẩm");

		
		productManager.addProduct(new Product(1L, "Tủ lạnh", 1300000.0, 5, electronicsCategory));
		productManager.addProduct(new Product(2L, "Quần Âu", 3000000.0, 10, clothingCategory));
		productManager.addProduct(new Product(3L, "Kẹo hồ lô", 50000.0, 20, foodCategory));

		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Add new Product");
			System.out.println("2. Edit Product by ID");
			System.out.println("3. Delete Product by ID");
			System.out.println("4. Show Product by ID");
			System.out.println("5. Show all Product");
			System.out.println("6. Show Product by Category");
			System.out.println("7. Sum price of all product");
			System.out.println("8. Show Product have price > 100000");
			System.out.println("9. Show Product have price > 200000 and Category is \"Điện tử\"");
			System.out.println("0. Exit");

			System.out.print("Enter your choice: ");
			try {
				choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					productManager.addNewProduct();
					break;
				case 2:
					productManager.update();
					break;
				case 3:
					productManager.delete();
					break;

				case 4:
					productManager.showDisplay();
					break;

				case 5:
					productManager.displayAllProducts();
					break;

				case 6:
					System.out.print("Enter category name:");
					String categoryName = scanner.nextLine();
					productManager.displayProductsByCategory(categoryName);
					break;

				case 7:
					double totalPrice = productManager.calculateTotalPrice();
					System.out.println("Sum price of all product:" + totalPrice);
					break;
				case 8:
					productManager.displayProductsAbovePrice(100000.0);
					break;

				case 9:
					productManager.displayProductsAbovePriceAndCategory(200000.0, "Điện tử");
					break;
				}
			} catch (Exception e) {
				System.out.println("Choice is a integer number.");
				scanner.nextLine();
				choice = -1;
			}
		} while (choice != 0);
		scanner.close();
	}
}