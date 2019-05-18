package controller.inventoryFeed;

import java.util.ArrayList;

public class SupplierProduct {

	private String supplier_id;
	private ArrayList<ProductInfoData> productInfo;

	public String getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}

	public ArrayList<ProductInfoData> getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(ArrayList<ProductInfoData> productInfo) {
		this.productInfo = productInfo;
	}

}
