package furama_resort.controllers;

import furama_resort.models.Booking;
import furama_resort.services.IBookingService;
import furama_resort.services.impl.BookingService;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public class BookingController {
    private static IBookingService bookingService = new BookingService();
    public void addNewBooking(Booking booking) {
        bookingService.addNewBooking(booking);
    }

    public Set<Booking> getAll() {
    return bookingService.getAll();
    }

    public Queue<Booking> getListBookingHouseAndVilla() {
        return bookingService.getListBookingHouseAndVilla();
    }

    public boolean checkExistBookingCode(String bookingCode) {
        return bookingService.checkExistBookingCode(bookingCode);
    }
}
