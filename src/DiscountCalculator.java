class DiscountCalculator {
    public double calculateDiscount(Object product) {
        if(product instanceof Product) {
            return ((Product)product).getDiscount();
        }
        return 0;
}
}

abstract class Product {
    public double price;
    public Product(double price) {
        this.price = price;
    }
    public double getDiscount(){
        return 0.1 * price;
    }
}

class FoodProduct extends Product {

    public FoodProduct(double price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return 0.1 * price;
    }
}

class ElectronicsProduct extends Product {

    public ElectronicsProduct(double price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return 0.05 * price;
    }
}

class ClothingProduct extends Product {

    public ClothingProduct(double price) {
        super(price);
    }

    @Override
    public double getDiscount() {
        return 0.25 * price;
    }
}