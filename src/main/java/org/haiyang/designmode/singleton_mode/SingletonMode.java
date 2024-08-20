package org.haiyang.designmode.singleton_mode;

import org.junit.jupiter.api.Test;

public class SingletonMode {
    @Test
    public void test() {
        System.out.println("SingletonMode\n#############");
        Singleton instance1 = Singleton.SingletonHolder.getInstance();
        Singleton instance2 = Singleton.SingletonHolder.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("##############");
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    static class SingletonHolder {
        public static Singleton getInstance() {
            if (instance == null)
                instance = new Singleton();
            return instance;
        }
    }

}


