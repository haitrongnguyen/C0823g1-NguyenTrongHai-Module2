package furama_resort.models.facility;

public class Room {
    private String freeService;
    public Room(){
    }
    public Room(String serviceCode, String serviceName, String usableArea,
                String rentalCosts, int maximumPeople, String rentalType,
                String freeService){
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
