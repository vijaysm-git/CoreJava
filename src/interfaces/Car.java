package interfaces;

public class Car implements Brake, Engine{
    @Override
    public void brake(){
        System.out.println("brake");

    }

    @Override
    public void acc() {
        System.out.println("acc");

    }
    @Override
    public void start(){
        System.out.println("start");


    }

    @Override
    public void stop() {
        System.out.println("stop");

    }
}
