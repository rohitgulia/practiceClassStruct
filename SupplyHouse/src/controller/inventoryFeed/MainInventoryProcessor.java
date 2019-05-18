package controller.inventoryFeed;

import java.io.File;

public class MainInventoryProcessor {

	
	// loop through all the files in directory and process
	
	// Database assumptions
	// New table is created to map appropriate column from file to qty and productId. As we don't know which column refer to qty and which
	// refer to productId it is better to save for each supplier which column is used for quantity and which column is used for productId.
	
	// we are creating one new table SUPPLIER_QTY_PRODUCT_COLUMN_MAPPING
	// Columns will be SUPPLIER_ID, QTY_COLUMN_NAME, PRODUCT_ID_COLUMN_NAME
	// primary key will be SUPPLIER_ID.
	// This table is used in DatabaseParser class.
	
	
	public MainInventoryProcessor() {
		// looping through all the files in directory
		int num_of_files = 10; // 10 is used just for demo
	for(int i=0;i<num_of_files;i++) {
		File file = new File("as");
		new InventoryController(file);
	}
	}
}
