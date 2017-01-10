package ae999;

/**
 * Created by ae on 10.01.2017.
 */
public class DbFinanceInfoBuilder implements FinanceInfoBuilder
{
  
  @Override
  public FinanceInformation buildFinanceInformation()
  {
    // Тут мы ходим в базу данных - как-будто
    System.out.println("Вызов метода для объекта DbFinanceInfoBuilder формируем финансовую информацию");
    return new FinanceInformation();
  }
  
}
