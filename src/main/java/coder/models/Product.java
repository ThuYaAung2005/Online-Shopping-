package coder.models;

public class Product {
	 private long id;
	 private long cat_id;
	 private long price;
	 private String name;
	 private String image;
	 private String description;
	 
	 public Product() {
	 }
	 
	public Product(long id, long cat_id, long price, String name, String image, String description) {
		super();
		this.id = id;
		this.cat_id = cat_id;
		this.price = price;
		this.name = name;
		this.image = image;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCat_id() {
		return cat_id;
	}

	public void setCat_id(long cat_id) {
		this.cat_id = cat_id;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	 
	 
}
