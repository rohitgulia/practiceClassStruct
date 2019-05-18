package controller.inventoryFeed.parser;

public class ColumnParser {
	private String qtyColumnName;
	private String productIdColumnName;
	
	public String getQtyColumnName() {
		return qtyColumnName;
	}
	public void setQtyColumnName(String qtyColumnName) {
		this.qtyColumnName = qtyColumnName;
	}
	public String getProductIdColumnName() {
		return productIdColumnName;
	}
	public void setProductIdColumnName(String productIdColumnName) {
		this.productIdColumnName = productIdColumnName;
	}

}
