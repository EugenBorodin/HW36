//Задача 1
//Создайте класс Soda (для определения типа газированной воды).
public class Soda {
  private String supplement;

  //У класса должен быть конструктор,
  public Soda (String supplement) {
    this.supplement = supplement;
  }
  // принимающий 1 аргумент при инициализации - строку добавка (например, "малина"),
  // отвечающий за добавку к выбираемому лимонаду.

  //В этом классе реализуйте метод public String GetMyDrinkString(),
  public String GetMyDrinkString() {

    return String.format("%s", supplement);
  }
  // Возвращающий строку Газировка и {добавка} в случае наличия добавки.
  //Если добавки нет, нужно вернуть строку "Обычная газировка".
}
