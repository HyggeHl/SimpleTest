package com.test.springboottest.myTest.designModel;

/**
 * @program: SimpleTest
 * @description: 模板方法
 * @author: hugge
 * @create: 2023/10/19
 */
public abstract class TemplateModal {
  // 模板方法，定义优惠券的应用流程
  public final void applyCoupon() {
    if (isCouponValid()) {
      if (isEligibleForDiscount()) {
        applyDiscount();
      }
      displayConfirmation();
    } else {
      displayInvalidCouponMessage();
    }
  }
  // 具体方法，用于判断优惠券是否有效
  protected boolean isCouponValid() {
    // 具体的判断逻辑，子类可以重写该方法来实现特定的有效性判断
    return true;
  }
  // 具体方法，用于判断用户是否符合优惠券的折扣条件
  protected boolean isEligibleForDiscount() {
    // 具体的判断逻辑，子类可以重写该方法来实现特定的条件判断
    return true;
  }
  // 抽象方法，由子类实现具体的优惠券折扣逻辑
  protected abstract void applyDiscount();
  // 抽象方法，由子类实现具体的优惠券确认展示逻辑
  protected abstract void displayConfirmation();
  // 具体方法，用于展示无效优惠券的信息
  protected void displayInvalidCouponMessage() {
    System.out.println("无效优惠券！");
  }
}
