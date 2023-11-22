package furama_resort.services;

import furama_resort.models.Booking;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public interface IBookingService {
    void addNewBooking(Booking booking);

    Set<Booking> getAll();

    Queue<Booking> getListBookingHouseAndVilla();

    boolean checkExistBookingCode(String bookingCode);
}
