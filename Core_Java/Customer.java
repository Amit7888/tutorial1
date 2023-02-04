package Core_Java;

public class Customer {
	
	  private String name;
	  private String address;
	  private long contactNum;
	  private String product;
	  public Customer(String name, String address, long contactNum, String product) {
			this.name = name;
			this.address = address;
			this.contactNum = contactNum;
			this.product = product;
		}


	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
}
	
