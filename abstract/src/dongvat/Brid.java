package dongvat;

public class Brid extends Animal{

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

   @Override
   public void makeSound() {
        System.out.println("Tweet tweet");
    }
    public  void fly(){

        System.out.println("Bird is flying");
    }
}
