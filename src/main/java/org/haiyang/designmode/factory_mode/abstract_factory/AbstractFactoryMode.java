package org.haiyang.designmode.factory_mode.abstract_factory;

import org.junit.jupiter.api.Test;

public class AbstractFactoryMode {
    @Test
    public void test() {
        System.out.println("AbstractFactoryMode\n#############");
        Factory factory1 = new Factory1();
        factory1.createBean();
        Factory factory2 = new Factory2();
        factory2.createBean();
        System.out.println("#############\n");
    }
}

interface Factory {
   Info createBean();
}

class Factory1 implements Factory {

    @Override
    public Info createBean() {
        Info info = new Info();
        info.country = new America();
        info.complexion = new White();
        return new Info();
    }
}

class Factory2 implements Factory {

    @Override
    public Info createBean() {
        Info info = new Info();
        info.country = new China();
        info.complexion = new Yellow();
        return new Info();
    }
}

class Info {
    Country country;
    Complexion complexion;

}

class Country {
    public Country() {}
}

class Complexion {
    public Complexion() {}
}

class America extends Country {

    public America() {
        System.out.println("America");
    }
}

class China extends Country {
    public China() {
        System.out.println("China");
    }
}
class White extends Complexion {

    public White() {
        System.out.println("White");
    }
}
class Yellow extends Complexion {
    public Yellow() {
        System.out.println("Yellow");
    }
}
