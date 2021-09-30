package com.makhabatusen;

public class Main {

    public static void main(String[] args) {

        // #1 CPU class with inner classes

        System.out.println("______\nTask 1: ");

        CPU cpu = new CPU();

        CPU.Processor processor = cpu. new Processor() {
            @Override
            public void setType(String type) {
                super.setType(type);
            }
        };

        processor.setType("Intel Core i9");
        CPU.RAM ram =  cpu  . new RAM() {
            @Override
            public void setSpeed(int speed) {
                super.setSpeed(speed);
            }
        };
        ram.setSpeed(2133);

        cpu.setProcessorType(processor.getType());
        cpu.setRamSpeed(ram.getSpeed());
        System.out.println( cpu.toString());






        System.out.println("______\nTask 2: ");
        // #2 Class Machine implementing Plant interface

        Machine machine = new Machine() {

            @Override
            void start() {
                super.start();
                System.out.println("Starts in main() method");
            }

            @Override
            public void grow() {
                super.grow();
                System.out.println("Grows in main() method");
            }
        };

        machine.start();
        machine.grow();

    }
}
