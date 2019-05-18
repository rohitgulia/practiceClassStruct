package controller.inventoryFeed;

import java.io.File;

public class InventoryController{
	
	public InventoryController(File file) {
		SupplierProduct sp = new SupplierProduct();
		String supplier_id = ""; // get it from file. Should be the name of the file without extension and trim it.
		String extension_file = ""; // get extension of file
		Extenion_of_file extenion_of_file = Extenion_of_file.CSV;
		SupplierController spController = new SupplierController();
		
		sp.setSupplier_id(supplier_id);
		// do processing of file name to know the file extension and put it as string in extension_file variable.
		
		if(extension_file == "csv")
			extenion_of_file = Extenion_of_file.CSV;
		if(extension_file.equalsIgnoreCase("excel"))
			extenion_of_file = Extenion_of_file.EXCEL;
		else
			extenion_of_file = Extenion_of_file.TAB_DELIMITED;
		
		try {
		switch(extenion_of_file) {
		case CSV:
			sp = spController.csvParse(sp, file);
			break;
		case EXCEL:
			sp = spController.excelParse(sp, file);
			break;
		case TAB_DELIMITED:
			sp = spController.tabDelimitedParse(sp, file);
			break;
		default:
			break;
		}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	enum Extenion_of_file {
		CSV, EXCEL, TAB_DELIMITED
	}
	
}