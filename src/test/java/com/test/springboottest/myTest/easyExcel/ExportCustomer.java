package com.test.springboottest.myTest.easyExcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillWrapper;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.test.springboottest.Entity.PerformanceInfo;
import com.test.springboottest.handle.ExcelFillCellMergeStrategy;
import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: springbootTest
 * @description: ExportCustomer
 * @author: hygge
 * @create: 2023/08/10
 */
public class ExportCustomer {

  public <T> void writeTwo(String fromFilename, String toFilename, String sheetName,
                                  Class<T> head, List<T> data) throws IOException {
    // 输出 Excel
    ExcelWriter excelWriter = EasyExcel.write(toFilename)
      .registerWriteHandler(new ExcelFillCellMergeStrategy(0,new int[]{0})) // 基于 column 长度，自动适配。最大 255 宽度
      .withTemplate(fromFilename)
      .build();
    WriteSheet writeSheet = EasyExcel.writerSheet(sheetName).build();
//    for(int i = 0; i < 3; i++) {
//      excelWriter.fill(new FillWrapper("single", data), writeSheet);
      excelWriter.fill(new FillWrapper("group", data), writeSheet);
//    }

    excelWriter.finish();
  }

  @Test
  void exportCustomer() throws IOException {

    List<PerformanceInfo> list = new ArrayList<>();
    PerformanceInfo performanceInfo1 = new PerformanceInfo();
    performanceInfo1.setUsername("用户1");
    performanceInfo1.setContractname("合同1");
    performanceInfo1.setProjectname("项目1");
//    performanceInfo1.setGroupcontractamount(new BigDecimal(10000));
//    performanceInfo1.setGroupoutbudget(new BigDecimal(20000));
//    performanceInfo1.setGroupnetincome(new BigDecimal(30000));
//    performanceInfo1.setGroupcollectionamount(new BigDecimal(40000));

    PerformanceInfo performanceInfo2 = new PerformanceInfo();
    performanceInfo2.setUsername("用户1");
    performanceInfo2.setContractname("合同1");
    performanceInfo2.setProjectname("项目2");
//    performanceInfo2.setGroupcontractamount(new BigDecimal(10000));
//    performanceInfo2.setGroupoutbudget(new BigDecimal(20000));
//    performanceInfo2.setGroupnetincome(new BigDecimal(30000));
//    performanceInfo2.setGroupcollectionamount(new BigDecimal(40000));

//    PerformanceInfo performanceInfo3 = new PerformanceInfo();
//    performanceInfo3.setUsername("用户2");
//    performanceInfo3.setContractname("合同2");
//    performanceInfo3.setProjectname("项目1");
//    performanceInfo3.setGroupcontractamount(new BigDecimal(10000));
//    performanceInfo3.setGroupoutbudget(new BigDecimal(20000));
//    performanceInfo3.setGroupnetincome(new BigDecimal(30000));
//    performanceInfo3.setGroupcollectionamount(new BigDecimal(40000));

    PerformanceInfo performanceInfo3 = new PerformanceInfo();
    performanceInfo3.setGroupcontractamount(new BigDecimal(10000));
    performanceInfo3.setGroupoutbudget(new BigDecimal(20000));
    performanceInfo3.setGroupnetincome(new BigDecimal(30000));
    performanceInfo3.setGroupcollectionamount(new BigDecimal(40000));

    PerformanceInfo performanceInfo4 = new PerformanceInfo();
    performanceInfo4.setUsername("用户3");
    performanceInfo4.setContractname("合同3");
    performanceInfo4.setProjectname("项目1");

    list.add(performanceInfo1);
    list.add(performanceInfo2);
    list.add(performanceInfo3);
    list.add(performanceInfo4);

    writeTwo("D:\\1testFiles\\业绩情况统计模板.xls","D:\\1testFiles\\业绩情况统计.xls", "业绩情况统计", PerformanceInfo.class, list);
  }
}
