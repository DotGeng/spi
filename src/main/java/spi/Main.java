package spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

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

    public static void sayHello4Dubbo() {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

    }

}
