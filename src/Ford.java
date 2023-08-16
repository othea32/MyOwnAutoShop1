public class Ford extends Car {
    int year;
    int manufDiscount;

    Ford(int speed, double regularPrice, String color, int year, int manufDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufDiscount = manufDiscount;
    }

    @Override
    double getSalePrice() {
        return regularPrice - manufDiscount;
    }
}
