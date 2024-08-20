package org.haiyang.designmode.builder_mode;

import org.springframework.stereotype.Component;

public class Computer {
    private String cpu;
    private String ram;

    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
    }

    public static class ComputerBuilder {
        private String cpu;
        private String ram;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}

class Test {
    @org.junit.jupiter.api.Test
    public void test() {
        Computer computer = new Computer.ComputerBuilder().setCpu("i9-13900ks").setRam("32GB").build();
        System.out.println(computer);
    }
}
