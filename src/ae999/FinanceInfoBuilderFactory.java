package ae999;

import java.util.PropertyResourceBundle;

/**
 * Created by ae on 10.01.2017.
 */
/*
 * Класс для создания экземпляра нужного класса
 */

public class FinanceInfoBuilderFactory
{
  // константа имени ресурса с именем класса для сбора финансовой информации
  private static final String BUILDER_CLASS="builder.class";
  
  public static FinanceInfoBuilder getFinanceInfoBuilder()
  {
    // Обратите внимание, что здесь мы ВЫНУЖДЕНЫ писать реальный класс
    // Хорошо, что это мы делаем только в одном месте, ане в каждой
    // строке, где нам потребуется обращение к FinanceInfoBuilder
    //return new DbFinanceInfoBuilder();
    // теперь мы будем создавать информацию через web
    //return new WebFinanceInfoBuilder();
    
    // теперь используем ресурсный файл, чтобы получить имя класса для
    // сбора финансовой информации
    PropertyResourceBundle pr = (PropertyResourceBundle) PropertyResourceBundle.getBundle("ae999.builder");
    String className = pr.getString(BUILDER_CLASS);
    // загружаем класс по имени
    try {
      Class cla = Class.forName(className);
      // Т.к. наш класс должен имплементировать интерфейс FinanceInfoBuilder
      // то мы можем сделать приведение к интерфейсу
      FinanceInfoBuilder build = (FinanceInfoBuilder) cla.newInstance();
      return build;
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }
  
}
