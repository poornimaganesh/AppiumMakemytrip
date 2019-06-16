package basefiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
public Object[][] getCellData(String path, String sheet) throws IOException, EncryptedDocumentException, InvalidFormatException {
FileInputStream stream = new FileInputStream(path);
Workbook workbook = WorkbookFactory.create(stream);
Sheet s = workbook.getSheet(sheet);
//Sheet s = workbook.getSheet("Sheet1");
int rowcount = s.getLastRowNum();
int cellcount = s.getRow(0).getLastCellNum();
String data[][] = new String[rowcount][cellcount];
for (int i = 1; i <= rowcount; i++) {
Row r = s.getRow(i);
for (int j = 0; j < cellcount; j++) {
Cell c = r.getCell(j);
try {
if (c.getCellType() == c.CELL_TYPE_STRING) {
//if (c.getCellType() == CellType.STRING) {
data[i - 1][j] = c.getStringCellValue();
} 
else
{
data[i - 1][j] = String.valueOf(c.getNumericCellValue());
}
} catch (Exception e) {
e.printStackTrace();
}
}
}
return data;
}

}
