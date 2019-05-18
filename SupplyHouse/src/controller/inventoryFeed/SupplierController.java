package controller.inventoryFeed;

import java.io.File;

import controller.inventoryFeed.parser.CsvParser;
import controller.inventoryFeed.parser.ExcelParser;
import controller.inventoryFeed.parser.TabDelimitedParser;

public class SupplierController implements Supplier{

	public SupplierProduct csvParse(SupplierProduct sp, File file) {
		new CsvParser(sp, file);
		new SetSupplierInfoInDatabase(sp);
		return sp;
	}

	public SupplierProduct excelParse(SupplierProduct sp, File file) {
		new ExcelParser(sp, file);
		new SetSupplierInfoInDatabase(sp);
		return sp;
	}

	public SupplierProduct tabDelimitedParse(SupplierProduct sp, File file) {
		new TabDelimitedParser(sp, file);
		new SetSupplierInfoInDatabase(sp);
		return sp;
	}

}
