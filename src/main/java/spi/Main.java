package spi;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello(){
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
