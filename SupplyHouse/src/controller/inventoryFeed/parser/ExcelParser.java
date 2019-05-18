package controller.inventoryFeed.parser;

import java.io.File;
import java.util.ArrayList;

import controller.inventoryFeed.ProductInfoData;
import controller.inventoryFeed.SupplierProduct;

public class ExcelParser {
	public ExcelParser(SupplierProduct sp, File file) {
		// go to database to check which column map to productId, qty.
		ColumnParser cp = new ColumnParser();
		DatabaseParser dp = new DatabaseParser();
		
		cp = dp.databaseParser(cp, sp.getSupplier_id());
		
		// get only those columns from file which are in columnParserColumnName 
		cp.getProductIdColumnName();
		cp.getQtyColumnName();
		
		// after parsing from file based on the column name from ColumnParser we get appropriate values for those
		
		ArrayList<ProductInfoData> productData = new ArrayList<ProductInfoData>();
		
		// loop through the give file and keep setting data in productData
		
		// storing in SupplierProduct
		sp.setProductInfo(productData);
	}
}
