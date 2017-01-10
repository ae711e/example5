package ae999;

/**
 * Created by ae on 10.01.2017.
 */
/*
 * Класс для создания экземпляра нужного класса
 */

public class FinanceInfoBuilderFactory
{
  public static FinanceInfoBuilder getFinanceInfoBuilder()
  {
    // Обратите внимание, что здесь мы ВЫНУЖДЕНЫ писать реальный класс
    // Хорошо, что это мы делаем только в одном месте, ане в каждой
    // строке, где нам потребуется обращение к FinanceInfoBuilder
    //return new DbFinanceInfoBuilder();
    // теперь мы будем создавать информацию через web
    return new WebFinanceInfoBuilder();
  }
  
}
