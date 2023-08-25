package com.test.springboottest.Entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @program: springbootTest
 * @description: 业绩情况
 * @author: hygge
 * @create: 2023/08/10
 */
@Data
@AllArgsConstructor
@Builder
public class PerformanceInfo {

//  @ExcelIgnore
  private String userid;

//  @ExcelProperty("姓名")
  private String username;

//  @ExcelIgnore
  private String projectid;

//  @ExcelProperty("项目名称")
  private String projectname;

//  @ExcelIgnore
  private String productlineid;

//  @ExcelProperty("产品线")
  private String productlinename;

//  @ExcelIgnore
  private String contractid;

//  @ExcelProperty("合同名称")
  private String contractname;

//  @ExcelProperty("签订日期")
  private Date signdate;

//  @ExcelProperty("合同总金额")
  private BigDecimal contractamount;

//  @ExcelProperty("外采预算")
  private BigDecimal outbudget;

//  @ExcelProperty("合同净收入")
  private BigDecimal netincome;

//  @ExcelProperty("回款额")
  private BigDecimal collectionamount;

//  @ExcelProperty("回款到账时间")
  private Date collectiondate;

//  @ExcelProperty("实际采购额")
  private BigDecimal realPurchase;

//  @ExcelProperty("采购贡献")
  private BigDecimal purchasecontribution;

  /**
   * 合同总金额和
   */
  private BigDecimal groupcontractamount;

  /**
   * 外采预算和
   */
  private BigDecimal groupoutbudget;

  /**
   * 合同净收入和
   */
  private BigDecimal groupnetincome;

  /**
   * 回款额和
   */
  private BigDecimal groupcollectionamount;

  public PerformanceInfo() {
    this.userid = "";
    this.username = "";
    this.projectid = "";
    this.projectname = "";

    this.productlineid = "";
    this.productlinename = "";
    this.contractid = "";
    this.contractname = "";

    this.signdate = null;
    this.contractamount = BigDecimal.ZERO;
    this.outbudget = BigDecimal.ZERO;
    this.netincome = BigDecimal.ZERO;

    this.collectionamount = BigDecimal.ZERO;
    this.collectiondate = null;
    this.realPurchase = BigDecimal.ZERO;
    this.purchasecontribution = BigDecimal.ZERO;

    this.groupcontractamount = BigDecimal.ZERO;
    this.groupoutbudget = BigDecimal.ZERO;
    this.groupnetincome = BigDecimal.ZERO;
    this.groupcollectionamount = BigDecimal.ZERO;
  }
}
