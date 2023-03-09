//Задача 1
//Создайте класс Soda (для определения типа газированной воды).
public class Soda {
  private String supplement;

  //У класса должен быть конструктор,
  public Soda(String supplement) {
    this.supplement = supplement;
  }
  // принимающий 1 аргумент при инициализации - строку добавка (например, "малина"),
  // отвечающий за добавку к выбираемому лимонаду.

  //В этом классе реализуйте метод public String GetMyDrinkString(),
  public String getMyDrinkString() {
    if (supplement == null) {
      return "Обычная Газировка";
    }
    if (supplement.isEmpty()) {
      return "Обычная Газировка";
      // Возвращающий строку Газировка и {добавка} в случае наличия добавки.
      //Если добавки нет, нужно вернуть строку "Обычная газировка".
    }
    return "Газировка и " + supplement;
  }
}

