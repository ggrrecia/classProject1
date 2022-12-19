package food;

public class Apple {

    private String type;
    private double weight;
    private double pricePerUnitWeight;

    public Apple (String type, double pricePreUnitWeight, double weightInGrams){
        this.type=type;
        this.pricePerUnitWeight=pricePreUnitWeight;
        weight =  0.00220 * weightInGrams;


    }

    public String getType(){
        return type;
    }

    public double getWeight(){
        return weight;

    }

    public double getPricePreUnitWeight() {
        return pricePerUnitWeight;
    }

    public void setPricePreUnitWeight(double pricePreUnitWeight, String personal) {
        this.pricePerUnitWeight = pricePreUnitWeight;

    }

    public void displayInfo(){
        System.out.println("==========================================");
        System.out.println("Apple Info");
        System.out.println("==========================================");
        System.out.printf("Type:\t\t\t\t\t %-15s\n", type);
        System.out.printf("Weight:\t\t\t\t\t %-6.4f lbs\n", weight);
        System.out.printf("Price Pre Unit: \t\t %-10.2f\n", pricePerUnitWeight);
        System.out.printf("Price: \t\t\t\t\t$%-10.2f\n",price());

    }

    public double price(){
        double price= weight*pricePerUnitWeight;
        return price;

    }
}
