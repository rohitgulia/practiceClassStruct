package controller.inventoryFeed.parser;

import java.io.File;
import java.util.ArrayList;

import controller.inventoryFeed.ProductInfoData;
import controller.inventoryFeed.SupplierProduct;

public class CsvParser {

	public CsvParser(SupplierProduct sp, File file) {
		// go to database to check which column map to productId, qty.
		ColumnParser cp = new ColumnParser();
		DatabaseParser dp = new DatabaseParser();

		cp = dp.databaseParser(cp, sp.getSupplier_id());

		// get only those columns from file which are in columnParserColumnName
		cp.getProductIdColumnName();
		cp.getQtyColumnName();

		ArrayList<ProductInfoData> productData = new ArrayList<ProductInfoData>();

		// loop through the give file and keep setting data in productData

		// storing in SupplierProduct
		sp.setProductInfo(productData);
	}
}
