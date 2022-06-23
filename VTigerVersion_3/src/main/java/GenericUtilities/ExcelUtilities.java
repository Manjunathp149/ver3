
package GenericUtilities;
/**
 * 
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities 
{
	/**
	 * 
	 * @param name
	 * @param Row
	 * @param Cell
	 * @return
	 * @throws Throwable
	 * @throws IOException
	 */
	public String Readfromexcel(String name, int Row, int Cell) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(name);
		Row R=sh.getRow(Row);
		Cell c=R.getCell(Cell);
		String value=c.toString();
		return value;
}
	/**
	 * 
	 * @param name
	 * @param Row
	 * @param Cell
	 * @param data
	 * @throws Throwable
	 * @throws IOException
	 */
	public String writeinexcel(String name, int Row, int Cell, String data) throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(name);
		Row R=sh.getRow(Row);
		Cell c=R.getCell(Cell);
		c.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Book1.xlsx");
		wb.write(fos);
		return data;
}}
