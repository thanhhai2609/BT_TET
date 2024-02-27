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
					try {
						System.out.print("Enter ID for new product: ");
						Long newId = scanner.nextLong();
						scanner.nextLine();
						System.out.print("Enter name for new product: ");
						String newName = scanner.nextLine();
						System.out.print("Enter price for new product: ");
						Double newPrice = scanner.nextDouble();
						System.out.print("Enter Quantity for new product: ");
						Integer newQuantity = scanner.nextInt();
						System.out.print("Enter Category Name for new product: ");
						String newCategoryName = scanner.next();
						Category newCategory = new Category(newCategoryName);

						productManager.addProduct(new Product(newId, newName, newPrice, newQuantity, newCategory));
						System.out.println("New infomation is updated.");

					} catch (Exception e) {
						System.out.println("Invalid data input.");
						scanner.nextLine();
					}
					break;
				case 2:
					System.out.print("Enter ID for product need to update:  ");
					Long idToUpdate = scanner.nextLong();
					scanner.nextLine();

					System.out.print("Enter ID for new product:  ");
					String newName = scanner.nextLine();
					System.out.print("Enter price for new product:  ");
					Double newPrice = scanner.nextDouble();
					System.out.print("Enter quantity for new product: ");
					Integer newQuantity = scanner.nextInt();
					System.out.print("Enter Category Name for new product:  ");
					String newCategoryName = scanner.next();
					Category newCategory = new Category(newCategoryName);
					productManager.updateProduct(idToUpdate, newName, newPrice, newQuantity, newCategory);
					System.out.println("New infomation is updated.");
					break;

				case 3:
					System.out.print("Enter ID for product need to delete: ");
					Long idToDelete = scanner.nextLong();
					scanner.nextLine();
					productManager.deleteProduct(idToDelete);
					System.out.println("Product is deleted");
					break;

				case 4:
					System.out.print("Enter ID for product need to display: ");
					Long idToDisplay = scanner.nextLong();
					scanner.nextLine();
					Product product = productManager.getProductById(idToDisplay);
					if (product != null) {
						System.out.println(product.id + " - " + product.name + " - " + product.price + " - "
								+ product.quantity + " - " + product.category.name);
					} else {
						System.out.println("Can not find the product.");
					}
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
