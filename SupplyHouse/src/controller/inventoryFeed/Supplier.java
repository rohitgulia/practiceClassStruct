package controller.inventoryFeed;

import java.io.File;

public interface Supplier {

	public SupplierProduct csvParse(SupplierProduct sp, File file);
	public SupplierProduct excelParse(SupplierProduct sp, File file);
	public SupplierProduct tabDelimitedParse(SupplierProduct sp, File file);
}
