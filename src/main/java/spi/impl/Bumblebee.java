package spi.impl;

import spi.Robot;

public class Bumblebee implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Bumblebee hello world");
    }
}
