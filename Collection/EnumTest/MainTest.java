package Collection.EnumTest;

public class MainTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setStatus(Pizza.PizzaStatus.ORDERED);
//        if(pizza instanceof Pizza){
//            System.out.println("av");
//        }
        if(Pizza.PizzaStatus.DELIVERED.equals(pizza.getStatus())){
            System.out.println("Successfully");
        }
    }
}
