package PRODUCT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product_Manager {
	private List<Product> products;
	private Scanner scanner = new Scanner(System.in);
	public Product_Manager() {
		this.products = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addNewProduct(){
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
			products.add(new Product(newId, newName, newPrice, newQuantity, newCategory));
			System.out.println("New infomation is updated.");

		} catch (Exception e) {
			System.out.println("Invalid data input.");
			scanner.nextLine();
		}
	}
	
	public void updateProduct(Long idToUpdate, String newName, Double newPrice, Integer newQuantity,
			Category newCategory) {
		for (Product product : products) {
			if (product.getId() == idToUpdate) {
				product.setProname(newName);
				product.setPrice(newPrice);
				product.setQuantity(newQuantity);
				product.setCategory(newCategory);
				return;
			}
		}
		System.out.println("Can find product to update.");
	}

	public void update() {
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
		updateProduct(idToUpdate, newName, newPrice, newQuantity, newCategory);
		System.out.println("New infomation is updated.");
	}
	
	public void deleteProduct(Long id) {
		products.removeIf(product -> product.getId() == id);
	}

	public void delete() {
		System.out.print("Enter ID for product need to delete: ");
		Long idToDelete = scanner.nextLong();
		scanner.nextLine();
		deleteProduct(idToDelete);
		System.out.println("Product is deleted");
	}
	public void showDisplay() {
		System.out.print("Enter ID for product need to display: ");
		Long idToDisplay = scanner.nextLong();
		scanner.nextLine();
		Product product = getProductById(idToDisplay);
		if (product != null) {
			System.out.println(product.getId() + " - " + product.getProname() + " - " + product.getPrice() + " - "
					+ product.getQuantity() + " - " + product.getCategory().getName());
		} else {
			System.out.println("Can not find the product.");
		}
	}
	public Product getProductById(Long id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	public void displayAllProducts() {
		for (Product product : products) {
			System.out.println(product.getId() + " - " + product.getProname() + " - " + product.getPrice() + " - " + product.getQuantity()
					+ " - " + product.getCategory().getName());
		}
	}

	public void displayProductsByCategory(String category) {
		for (Product product : products) {
			if (product.getCategory().getName().equals(category)) {
				System.out.println(product.getId() + " - " + product.getProname() + " - " + product.getPrice() + " - "
						+ product.getQuantity() + " - " + product.getCategory().getName());
			}
		}
	}

	public Double calculateTotalPrice() {
		Double totalPrice = 0.0;
		for (Product product : products) {
			totalPrice += product.getPrice() * product.getQuantity();
		}
		return (Double) totalPrice;
	}

	
	public void displayProductsAbovePrice(Double price) {
		for (Product product : products) {
			if (product.getPrice() > price) {
				System.out.println(product.getId() + " - " + product.getProname() + " - " + product.getPrice() + " - "
						+ product.getQuantity() + " - " + product.getQuantity());
			}
		}
	}

	public void displayProductsAbovePriceAndCategory(Double price, String categoryName) {
		for (Product product : products) {
			if (product.getPrice() > price && product.getCategory().getName().equals(categoryName)) {
				System.out.println(product.getId() + " - " + product.getProname() + " - " + product.getPrice() + " - "
						+ product.getQuantity() + " - " + product.getCategory().getName());
			}
		}
	}
}