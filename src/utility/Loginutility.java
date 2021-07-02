package utility;

import java.util.ArrayList;

public class Loginutility {
	static Xls_Reader reader;
	  
	public static ArrayList<Object[]>getdata()
	{
		ArrayList<Object[]> testdata=new ArrayList<Object[]>();
		
		reader=new Xls_Reader("./src/testdata/Book2.xlsx");
		String sheetname="test";
		int count=reader.getRowCount(sheetname);
		
		for(int rownum=2;rownum<=count;rownum++)
		{
			String username=reader.getCellData(sheetname, "Username", rownum);
			String password=reader.getCellData(sheetname, "Password", rownum);
			Object obj[]= {username,password};
			testdata.add(obj);
		}
		
		return testdata;
		
		
	}

		
	

}
