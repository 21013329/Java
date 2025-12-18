public class Main {
  public static void main(String[] args) {
    String message = "Hello World, We are here !";
    System.out.println(message);

    Animal dog = new Dog();
    Animal cat = new Cat();

    System.out.println(dog.speak());
    System.out.println(cat.speak());
  }
}

interface Animal {
  String speak();
}

class Dog implements Animal {
  @Override
  public String speak() {
    return "Woof! Woof!";
  }
}

class Cat implements Animal {
  @Override
  public String speak() {
    return "Meow! Meow!";
  }
}