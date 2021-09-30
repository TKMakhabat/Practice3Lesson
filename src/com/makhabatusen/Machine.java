package com.makhabatusen;

public class Machine implements Plant {

    void  start() {
        System.out.println("Starting this machine");
    }

    @Override
    public void grow() {
        System.out.println("Machine grows the plant");
    }
}
