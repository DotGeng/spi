package spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Robot {
    public void sayHello();
}
