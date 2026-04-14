package com.advanceJava.DesignPatterns.Creational.Builder;

public class House {
    private final int roomNumber;
    private final int bathNumber;
    private final int kitchenNumber;
    private final boolean isSwimmingPool;
    private final boolean isGarden;
    private final boolean isRoof;
    private final boolean isParking;

    public int getRoomNumber() {
        return roomNumber;
    }
    public int getBathNumber() {
        return bathNumber;
    }
    public int getKitchenNumber() {
        return kitchenNumber;
    }
    public boolean isSwimmingPool() {
        return isSwimmingPool;
    }
    public boolean isGarden() {
        return isGarden;
    }
    public boolean isRoof() {
        return isRoof;
    }
    public boolean isParking() {
        return isParking;
    }

    private House(int roomNumber, int bathNumber, int kitchenNumber,  boolean isSwimmingPool, boolean isGarden, boolean isRoof, boolean isParking) {
        this.roomNumber = roomNumber;
        this.bathNumber = bathNumber;
        this.kitchenNumber = kitchenNumber;
        this.isSwimmingPool = isSwimmingPool;
        this.isGarden = isGarden;
        this.isRoof = isRoof;
        this.isParking = isParking;
    }
    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("House{");

        if (roomNumber > 0) sb.append("roomNumber=").append(roomNumber).append(", ");
        if (bathNumber > 0) sb.append("bathNumber=").append(bathNumber).append(", ");
        if (kitchenNumber > 0) sb.append("kitchenNumber=").append(kitchenNumber).append(", ");
        if (isSwimmingPool) sb.append("swimmingPool=true, ");
        if (isGarden) sb.append("garden=true, ");
        if (isRoof) sb.append("roof=true, ");
        if (isParking) sb.append("parking=true, ");
        if (sb.length() > 6) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("}");
        return sb.toString();
    }
    public static class HouseBuilder {
        private int roomNumber = 0;
        private int bathNumber = 0;
        private int kitchenNumber = 0;
        private boolean isSwimmingPool = false;
        private boolean isGarden = false;
        private boolean isRoof = false;
        private boolean isParking = false;

        public HouseBuilder setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }
        public HouseBuilder setBathNumber(int bathNumber) {
            this.bathNumber = bathNumber;
            return this;
        }
        public HouseBuilder setKitchenNumber(int kitchenNumber) {
            this.kitchenNumber = kitchenNumber;
            return this;
        }
        public HouseBuilder setSwimmingPool(boolean isSwimmingPool) {
            this.isSwimmingPool = isSwimmingPool;
            return this;
        }
        public HouseBuilder setGarden(boolean isGarden) {
            this.isGarden = isGarden;
            return this;
        }
        public HouseBuilder setRoof(boolean isRoof) {
            this.isRoof = isRoof;
            return this;
        }
        public HouseBuilder setParking(boolean isParking) {
            this.isParking = isParking;
            return this;
        }
        public House build() {
            if(roomNumber < 1){
                throw new IllegalArgumentException("Room number must be greater than 0");
            }
            return new House(roomNumber, bathNumber, kitchenNumber, isSwimmingPool, isGarden, isRoof, isParking);
        }
    }
}
