package PRODUCT;

public class Product {
	private long id;
	private String proname;
	private double price;
	private int quantity;
	private Category category;

	public Product(long id, String proname, double price, int quantity, Category category) {
		super();
		this.id = id;
		this.proname = proname;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public Product() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
