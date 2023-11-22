package furama_resort.repositories;

import furama_resort.models.Booking;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public interface IBookingRepository {
    void addNewBooking(Booking booking);

    Set<Booking> getAll();

    Queue<Booking> getListBookingHouseAndVilla();

    boolean checkExistBookingCode(String bookingCode);
}
