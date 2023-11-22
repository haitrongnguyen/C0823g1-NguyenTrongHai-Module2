package furama_resort.repositories.impl;

import furama_resort.models.Booking;
import furama_resort.repositories.IBookingRepository;
import furama_resort.utils.read_and_write.booking.BookingReadFile;
import furama_resort.utils.read_and_write.booking.BookingWriteToFile;

import java.util.*;

public class BookingRepository implements IBookingRepository {
    @Override
    public void addNewBooking(Booking booking) {
        Set<Booking> bookings1 = BookingReadFile.readBooking();
        bookings1.add(booking);
        BookingWriteToFile.writeToFile(bookings1);
    }

    @Override
    public Set<Booking> getAll() {
        return BookingReadFile.readBooking();
    }

    @Override
    public Queue<Booking> getListBookingHouseAndVilla() {
        Set<Booking> bookings = BookingReadFile.readBooking();
        Queue<Booking> bookings1 = new PriorityQueue<>();
        for (Booking booking: bookings){
            if (booking.getServiceCode().contains("SVHO-")||booking.getServiceCode().contains("SVVL-")){
                bookings1.add(booking);
            }
        }
        return bookings1;
    }

    @Override
    public boolean checkExistBookingCode(String bookingCode) {
        Set<Booking> bookings = BookingReadFile.readBooking();
        for (Booking booking: bookings){
            if (booking.getBookingCode().equals(bookingCode)){
                return true;
            }
        }
        return false;
    }
}
