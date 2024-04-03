package DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TwoDarray {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step 1 = 	Create Fis
		File abspath = new File("./Resources/Demo2.xlsx");
		FileInputStream fis = new FileInputStream(abspath);
		
		//Step 2 = Respective file obejct creation 
		Workbook workbook = WorkbookFactory.create(fis);
		
		//Step 3 = Read method 
		int RowCount = workbook.getSheet("Sheet1").getPhysicalNumberOfRows();
		int CellCount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();

		String[][]arr=new String[RowCount][CellCount];
		
		for(int i=0;i<RowCount;i++)
		{
          for(int j=0;j<RowCount;j++)
			{
				arr[i][j]= workbook.getSheet("Sheet1").getRow(i).getCell(j).toString();
			}

		}
		
		for(int i=0;i<RowCount;i++)
		{
          for(int j=0;j<CellCount;j++)
			{
				System.out.print(arr[i][j]);
			}
          System.out.println();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
