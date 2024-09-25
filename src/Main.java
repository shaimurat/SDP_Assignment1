//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClothingProduct clothing = new ClothingProduct(100);
        System.out.println(clothing.getDiscount());
        ElectronicsProduct elec = new ElectronicsProduct(100);
        System.out.println(elec.getDiscount());
        FoodProduct food = new FoodProduct(100);
        System.out.println(food.getDiscount());
    }
}