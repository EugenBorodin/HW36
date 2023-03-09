public class Main {
  public static void main(String[] args) {

    Soda firstMySoda = new Soda(null);
    System.out.println(firstMySoda.getMyDrinkString());
    Soda secondMySoda = new Soda("");
    System.out.println(secondMySoda.getMyDrinkString());
    Soda thirdMySoda = new Soda("lemon");
    System.out.println(thirdMySoda.getMyDrinkString());
  }
}
