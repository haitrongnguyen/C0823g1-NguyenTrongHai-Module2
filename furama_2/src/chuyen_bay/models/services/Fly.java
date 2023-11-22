package chuyen_bay.models.services;

public class Fly {
    private int flyCode;
    private String dayFly;
    private String hourFly;
    private String placeTo;
    private String placeFrom;

    public Fly() {
    }

    public Fly(int flyCode, String dayFly, String hourFly, String placeTo, String placeFrom) {
        this.flyCode = flyCode;
        this.dayFly = dayFly;
        this.hourFly = hourFly;
        this.placeTo = placeTo;
        this.placeFrom = placeFrom;
    }

    public Fly(String dayFly, String hourFly, String placeTo, String placeFrom) {
        this.dayFly = dayFly;
        this.hourFly = hourFly;
        this.placeTo = placeTo;
        this.placeFrom = placeFrom;
    }

    public int getFlyCode() {
        return flyCode;
    }

    public void setFlyCode(int flyCode) {
        this.flyCode = flyCode;
    }

    public String getDayFly() {
        return dayFly;
    }

    public void setDayFly(String dayFly) {
        this.dayFly = dayFly;
    }

    public String getHourFly() {
        return hourFly;
    }

    public void setHourFly(String hourFly) {
        this.hourFly = hourFly;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

    @Override
    public String toString() {
        return "Fly{" +
                "flyCode: " + flyCode +
                ", dayFly: " + dayFly +
                ", hourFly: " + hourFly +
                ", placeTo: " + placeTo +
                ", placeFrom: " + placeFrom +
                '}';
    }
}
