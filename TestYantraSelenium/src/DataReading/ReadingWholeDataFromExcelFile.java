package DataReading;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingWholeDataFromExcelFile {

	public static void main(String[] args) throws IOException 
	{
		File absPath = new File("./Resources/Demo2.xlsx");
		FileInputStream fis= new FileInputStream(absPath);
		Workbook workbook = WorkbookFactory.create(absPath);
		int row = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cell = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
		String[][] arr= new String [row][cell];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				arr[i][j]=workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cell;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
