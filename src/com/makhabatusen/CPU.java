package com.makhabatusen;

public class CPU {

    private int ramSpeed;
    private String processorType;

    public int getRamSpeed() {
        return ramSpeed;
    }

    public void setRamSpeed(int ramSpeed) {
        this.ramSpeed = ramSpeed;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    protected  class RAM {
        private int speed;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }

    protected  class Processor {
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    @Override
    public String toString() {
        return "CPU{" +
                "ramSpeed=" + ramSpeed +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
