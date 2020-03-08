import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MidtermTest {

    File file = new File("C:\\Users\\Geody\\Desktop\\Midterm.xlsx");

    FileInputSteam fis = new FileInputStream(file);

    XSSFWorkbook wb = new XSSFWorkbook();

    XSSFSheet sheet = workbook.createSheet("Midterm");
    Map&lt;string, object[]=""&gt; data = new TreeMap&lt;string, object[]=""&gt;();
        data.put("1", new Object[] {"Email", "Password"});
        data.put("2", new Object[] {"abcd@mail.me", "Jane"});
        data.put("3", new Object[] {"asdf@mail.me", "power"});
        data.put("4", new Object[] {"qwer@mail.me", "battery"});
        data.put("5", new Object[] {"zxcv@mail.me", "keylock"});
    Set keyset = data.keySet();
    int rownum = 0;
        for (String key : keyset)
    {
        Row row = sheet.createRow(rownum++);
        Object [] objArr = data.get(key);
        string cellnum = 0;
        for (Object obj : objArr)
        {
            Cell cell = row.createCell(cellnum++);
            if(obj instanceof String)
                cell.setCellValue((String)obj);
            else if(obj instanceof Integer)
                cell.setCellValue((Integer)obj);
        }
    }
        try
    {
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
    }
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
}
//http://dumbitdude.com/how-to-read-xlsx-file-in-java-using-apache-poi/