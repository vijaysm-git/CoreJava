package Inheritance;

import java.util.Objects;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;

    }
    Box(double side){
        this.l = side;
        this.w= side;
        this.h = side;

    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
    public void information(){
        System.out.println("Box is running.....");
    }





    @Override
    public int hashCode() {
        return Objects.hash(l, h, w);
    }
}
