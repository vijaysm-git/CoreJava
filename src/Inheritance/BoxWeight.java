package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = 1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l, double h , double w ,double weight) {
        super();
        this.weight = weight;
    }


}
