public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 30000, "Red", 21);
        Ford ford1 = new Ford(150, 35000, "Blue", 2022, 2000);
        Ford ford2 = new Ford(160, 48000, "Black", 2000, 2500);
        Car car = new Car(110, 35000, "White");

        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());
        System.out.println("Sale price of Ford1: $" + ford1.getSalePrice());
        System.out.println("Sale price of Ford2: $" + ford2.getSalePrice());
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}