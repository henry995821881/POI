package org.henry;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcOut {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("d:\\foo.xls");
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet s = wb.createSheet();
		wb.setSheetName(0, "Matrix");
		for (int i = 0; i < 50; i++) {
			HSSFRow row = s.createRow(i);
			for (int j = 0; j < 50; j++) {
				HSSFCell cell = row.createCell(j);
				cell.setCellValue("" + i + "," + j);
			}
		}
		wb.write(fos);
		fos.close();
	}

}
