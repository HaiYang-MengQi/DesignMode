package org.haiyang.designmode.factory_mode.simple_factory;

import org.junit.jupiter.api.Test;

public class SimpleFactoryMode {

    @Test
    public void test() {
        System.out.println("SimpleFactoryMode\n#############");
        new Factory().createProduct(1);
        new Factory().createProduct(2);
        System.out.println("##############");
    }
}

class Factory{
    public void createProduct(int count) {
        if (count == 1)
            new Product1();
        else if (count == 2)
            new Product2();
    }
}

class Product1 {
    public Product1() {
        System.out.println("Product1 is created");
    }
}

class Product2 {
    public Product2() {
        System.out.println("Product2 is created");
    }
}