package furama_resort.models.facility;

import furama_resort.models.facility.Facility;

public class House extends Facility {
    private String roomStandards;
    private int numberOfFloor;
    public House(){
    }
    public House(String serviceCode, String serviceName, String usableArea, String rentalCosts,
                 int maximumPeople, String rentalType,String roomStandards,
                 int numberOfFloor){
        super(serviceCode,serviceName,usableArea,rentalCosts,maximumPeople,rentalType);
        this.roomStandards = roomStandards;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
