/*
 * Copyright (c) 2017. Aleksey Eremin
 * 10.01.17 16:21
 */

package ae999;

/**
 * Created by ae on 10.01.2017.
 */
public class WebFinanceInfoBuilder implements FinanceInfoBuilder
{
  @Override
  public FinanceInformation buildFinanceInformation() {
    System.out.println("WebFinanceInfoBuilder: Работаем через web чтобы собрать финансовую информацию");
    return new FinanceInformation();
  }
}
