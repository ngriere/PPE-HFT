/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * Allows to read an excel file
 *
 * @author Nicolas_2
 */
public class ReadExcelFile {

    private String inputFile;

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
          Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR, 14);
        now.set(Calendar.MINUTE, 24);
        now.set(Calendar.SECOND, 0);
        System.out.println(sdf.format(now.getTime()));
    }

    public void read() throws IOException, InterruptedException {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);

            // Loop over first 10 column and lines
            for (int j = 0; j < sheet.getRows(); j++) {
                System.out.println("");
                TimeUnit.SECONDS.sleep(2);
                for (int i = 0; i < sheet.getColumns(); i++) {
                    Cell cell = sheet.getCell(i, j);
                    CellType type = cell.getType();
                    if (type == CellType.LABEL) {
                        System.out.print(cell.getContents()+"   ");
                    } else if (cell.getContents() != "") {
                        System.out.print(cell.getContents() + "    ");
                    }    
                }
            }
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }
}
