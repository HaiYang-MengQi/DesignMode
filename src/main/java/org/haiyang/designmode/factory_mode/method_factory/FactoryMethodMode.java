package org.haiyang.designmode.factory_mode.method_factory;

import org.junit.jupiter.api.Test;

public class FactoryMethodMode {
    @Test
    public void test() {
        System.out.println("FactoryMethodMode\n#############");
        Factory factory1 = new Factory1();
        Factory factory2 = new Factory2();
        factory1.createBean();
        factory2.createBean();
        System.out.println("#############");
    }
}

interface Factory {
    public Product createBean();
}

class Factory1 implements Factory {
    public Product createBean() {
        return new Lenovo();
    }
}

class Factory2 implements Factory {
    public Product createBean() {
        return new HP();
    }
}

class Product {

}

class Lenovo extends Product {
    public Lenovo() {
        System.out.println("Lenovo");
    }
}
class HP extends Product {
    public HP() {
        System.out.println("HP");
    }
}
