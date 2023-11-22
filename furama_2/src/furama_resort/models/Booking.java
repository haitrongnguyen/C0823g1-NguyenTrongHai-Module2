package furama_resort.models;

import java.util.Comparator;

public class Booking implements Comparable<Booking> {
    private String bookingCode;
    private String bookingDay;
    private String beginDay;
    private String endDay;
    private String customerCode;
    private String serviceCode;

    public Booking() {
    }

    public Booking(String bookingCode,String bookingDay, String beginDay, String endDay, String customerCode, String serviceCode) {
        this.bookingCode = bookingCode;
        this.bookingDay = bookingDay;
        this.beginDay = beginDay;
        this.endDay = endDay;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public Booking(String bookingCode, String bookingDay, String beginDay, String endDay) {
        this.bookingCode = bookingCode;
        this.bookingDay = bookingDay;
        this.beginDay = beginDay;
        this.endDay = endDay;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", bookingDay='" + bookingDay + '\'' +
                ", beginDay='" + beginDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        String[] bookingDate = this.getBookingDay().split("/");
        String[] bookingDateO = o.getBookingDay().split("/");
        String[] endDay = this.getEndDay().split("/");
        String[] endDayO = o.getEndDay().split("/");
        if (Integer.parseInt(bookingDate[0]) != Integer.parseInt(bookingDateO[0])){
            return Integer.compare(Integer.parseInt(bookingDate[0]),Integer.parseInt(bookingDateO[0]));
        }else {
            return Integer.compare(Integer.parseInt(endDay[0]),Integer.parseInt(endDayO[0]));
        }
    }
}
