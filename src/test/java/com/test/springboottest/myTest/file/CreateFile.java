package com.test.springboottest.myTest.file;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: springbootTest
 * @description: createFile
 * @author: hygge
 * @create: 2023/08/14
 */
public class CreateFile {

  @Test
  void createFile() throws IOException {

    String fileAllPath = "D:\\1testFiles\\all.xlsx";
//
//    File targetFile = new File(fileAllPath);
//    if(!targetFile.exists())
//      targetFile.createNewFile();

    createXlsx(fileAllPath);
  }

  public void createXlsx(String fileName) {

    try {
      Workbook workbook = new XSSFWorkbook();

      // 创建一个默认的 sheet
      Sheet sheet = workbook.createSheet();

      // 保存文件
      FileOutputStream fileOut = new FileOutputStream(fileName);
      workbook.write(fileOut);
      fileOut.close();

      System.out.println("空的 XLSX 文件创建成功！");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
