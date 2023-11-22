package furama_resort.models.facility;

public class Facility {
    private String serviceCode;
    private String serviceName;
    private Double usableArea;
    private Long rentalCosts;
    private Integer maximumPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, Double usableArea, Long rentalCosts, Integer maximumPeople,
                    String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public Facility(String name, Double area, Long cost, Integer maxPeople, String rentalType) {
        this.serviceName = name;
        this.usableArea = area;
        this.rentalCosts = cost;
        this.maximumPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public Long getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Long rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(Integer maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  " serviceCode: " + serviceCode +
                ", serviceName: " + serviceName +
                ", usableArea: " + usableArea +
                ", rentalCosts: " + rentalCosts +
                ", maximumPeople: " + maximumPeople+
                ", rentalType: " + rentalType;
    }
}
