/*
 * Copyright (c) 2017. Aleksey Eremin
 * 10.01.17 16:12
 */

package ae999;

/*
 Изучаем рефлексию
 by novel  http://java-course.ru/begin/reflection/
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Получаем нужный объект
        FinanceInfoBuilder fib = FinanceInfoBuilderFactory.getFinanceInfoBuilder();
        // вызываем метод
        FinanceInformation info = fib.buildFinanceInformation();
        
        // вызов getClass() получим описание у объекта
        System.out.println("Имя класса: " + fib.getClass().getCanonicalName());
        
        // дальше обработка полученной "информации"
    }
}
