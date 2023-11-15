package furama_resort.models.facility;

import furama_resort.models.facility.Facility;

public class Villa extends Facility {
    private String roomStandards;
    private Double poolArea;
    private Integer numberOfFloor;
    public Villa(){
    }
    public Villa(String serviceCode, String serviceName, Double usableArea,
                 Long rentalCosts, Integer maximumPeople, String rentalType,
                 String roomStandards,Double poolArea,Integer numberOfFloor){
        super(serviceCode,serviceName,usableArea,rentalCosts,maximumPeople,rentalType);
        this.roomStandards = roomStandards;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +super.toString()+
                "roomStandards='" + roomStandards + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
