import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;
import spi.Robot;

import java.util.ServiceLoader;

public class SpiTest {

    @Test
    public void sayHello(){
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

    @Test
    public void sayHello4Dubbo() {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

    }
}
