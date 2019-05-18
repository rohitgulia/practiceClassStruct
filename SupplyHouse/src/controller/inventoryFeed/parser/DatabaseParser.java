package controller.inventoryFeed.parser;

public class DatabaseParser {

	// SUPPLIER_QTY_PRODUT_COLUMN_MAPPING table is used here
	public ColumnParser databaseParser(ColumnParser cp, String supplierId) {
		// go to database to get appropriate column maping for qty and product_id using supplier_id
		
		// select qtyColumnName, productIdColumnName from supplierColumnMapping where  supplierId = 'supplierId' 
		
		cp.setProductIdColumnName(""); // from db
		cp.setQtyColumnName(""); // from db
		
		return cp;
				
	}
}
