package productservicepublisher;

public class Item {
	
	
	private int id;
	private String itemName;
	private String itemCode;
	private String itemDesc;
	private double itemPrice;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	public Item() {
		super();
	}
	
	
	public Item(int id, String itemName, String itemCode, String itemDesc, double itemPrice) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
	}
	
	
	@Override
	public String toString() {
		return "id=" + id + " itemName=" + itemName + " itemCode=" + itemCode + " itemDesc=" + itemDesc
				+ " itemPrice=" + itemPrice + "\n";
	}
	
	
	public String toStringWith() {
		return " Item name=" + itemName + "\n itemCode=" + itemCode + "\n itemDesc=" + itemDesc
				+ "\n itemPrice=" + itemPrice + "\n";
	}
	
	
}
