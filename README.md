# practiceClassStruct
Class design and app structure to process files in directory


## Entry point is MainInventoryProcessor.java.

**Database assumptions**
	
  -New table is created to map appropriate column from file to qty and productId. As we don't know which column refer to qty and which
	  refer to productId it is better to save for each supplier which column is used for quantity and which column is used for productId.
	
  -We are creating one new table SUPPLIER_QTY_PRODUCT_COLUMN_MAPPING.
	 Columns will be SUPPLIER_ID, QTY_COLUMN_NAME, PRODUCT_ID_COLUMN_NAME.
	 primary key will be SUPPLIER_ID.
	 This table is used in DatabaseParser class.
	
