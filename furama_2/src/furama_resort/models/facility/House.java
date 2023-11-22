package furama_resort.models.facility;

import furama_resort.models.facility.Facility;

public class House extends Facility {
    private String roomStandards;
    private Integer numberOfFloor;
    public House(){
    }
    public House(String serviceCode, String serviceName, Double usableArea, Long rentalCosts,
                 Integer maximumPeople, String rentalType,String roomStandards,
                 Integer numberOfFloor){
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

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                ", roomStandards: " + roomStandards +
                ", numberOfFloor: " + numberOfFloor +
                '}';
    }
}
