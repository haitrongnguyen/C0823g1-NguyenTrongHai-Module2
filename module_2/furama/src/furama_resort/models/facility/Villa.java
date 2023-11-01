package furama_resort.models.facility;

import furama_resort.models.facility.Facility;

public class Villa extends Facility {
    private String roomStandards;
    private int poolArea;
    private int numberOfFloor;
    public Villa(){
    }
    public Villa(String serviceCode, String serviceName, String usableArea,
                 String rentalCosts, int maximumPeople, String rentalType,
                 String roomStandards,int poolArea,int numberOfFloor){
        super(serviceCode,serviceName,usableArea,rentalCosts,maximumPeople,rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = numberOfFloor;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
