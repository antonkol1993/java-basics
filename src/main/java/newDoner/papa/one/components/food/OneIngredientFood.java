package newDoner.papa.one.components.food;

public abstract class OneIngredientFood {

    private final String name;
    private final FoodType foodType;
    private final double price;

    public OneIngredientFood(String name, FoodType foodType, double price) {
        this.name = name;
        this.foodType = foodType;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "OneIngredientFood{" +
                "name='" + name + '\'' +
                ", foodType=" + foodType +
                ", price=" + price +
                '}' + "\n";
    }
}
