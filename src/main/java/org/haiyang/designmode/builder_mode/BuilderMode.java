package org.haiyang.designmode.builder_mode;

import org.springframework.stereotype.Component;

public class BuilderMode {
    private String cpu;
    private String ram;

    private BuilderMode(BuilderModeBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
    }

    public static class BuilderModeBuilder {
        private String cpu;
        private String ram;

        public BuilderModeBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public BuilderModeBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public BuilderMode build() {
            return new BuilderMode(this);
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
        BuilderMode builderMode = new BuilderMode.BuilderModeBuilder().setCpu("i9-13900ks").setRam("32GB").build();
        System.out.println(builderMode);
    }
}
